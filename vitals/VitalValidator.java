package Vitals;
import java.util.Map;

public class VitalValidator {
	VitalTypes vitaltype = new VitalTypes();
	Map<String, int[]> vitalypes = vitaltype.getMap();
	
	IReporter ir = new AlertService();
	IAlertSystem ias = new AlertService();  /* used just for learning purpose */
	
	public boolean isVitalOk(String vital_type, Integer check_value) {
		int[] range = vitalypes.get(vital_type);
		int min = range[0];
		int max = range[1];
		
		if (check_value < min) {
			String[] message = new String[] {vital_type,"low"};
			ias.sound_alarm(message);
			ias.sms_alarm(message);
			ir.send_report_to_doctor(message);
			return false;
		}
		if (check_value > max) {
			String[] message = new String[] {vital_type,"high"};
			ias.sound_alarm(message);
			ias.sms_alarm(message);
			ir.send_report_to_doctor(message);
			return false;
		}
		return true;
	}
}
