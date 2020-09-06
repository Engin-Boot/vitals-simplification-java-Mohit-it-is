package vitals;

public interface IReporter extends ISound_Alarm, ISms_alarm{
	public void send_report_to_doctor(String[] strings);	
}
