package vitals;
import java.util.Map;

public class VitalValidator {
	VitalTypes vitaltype = new VitalTypes();
	Map<String, int[]> vitalypes = vitaltype.getMap();
	
	IReporter ir = AlertFactory.getAlertInstance(); // AlertFacotry.getAlertInstance() not working due to import error
	
	public boolean isVitalOk(String vital_type, Integer check_value) {
		int[] range = vitalypes.get(vital_type);
		int min = range[0];
		int max = range[1];
		
		if (check_value < min) {
			String[] message = new String[] {vital_type,"low"};
			ir.sound_alarm(message);
			ir.sms_alarm(message);
			ir.send_report_to_doctor(message);
			return false;
		}
		if (check_value > max) {
			String[] message = new String[] {vital_type,"high"};
			ir.sound_alarm(message);
			ir.sms_alarm(message);
			ir.send_report_to_doctor(message);
			return false;
		}
		return true;
	}
}
