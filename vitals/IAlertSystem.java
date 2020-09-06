package vitals;

public interface IAlertSystem {
	public void sound_alarm(String[] message);
	public void sms_alarm(String[] message);
}
