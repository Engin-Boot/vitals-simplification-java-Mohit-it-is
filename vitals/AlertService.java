package vitals;

public class AlertService implements IAlertSystem,IReporter{
	

	@Override
	public void send_report_to_doctor(String [] alert_message) {
		System.out.println("Call" + " " + "doctor " + alert_message[0] + " " + alert_message[1]);
		//write code to mail report
	}

	@Override
	public void sound_alarm(String [] alert_message) {
		// Write Code to raise alarm
		
	}

	@Override
	public void sms_alarm(String [] alert_message) {
		// Write Code to raise alarm
		
	}
	
}
