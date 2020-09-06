package Vitals;
import java.util.Map;


public class Main {

	public static boolean vitalsAreOk(Map<String, Integer> check_vitalvalue) {
		VitalValidator vitalvalidator = new VitalValidator();
		boolean flag = true;

		for (Map.Entry<String, Integer> entry : check_vitalvalue.entrySet()) {
			flag = flag && vitalvalidator.isVitalOk(entry.getKey(), entry.getValue());
		}
		return bool_return(flag); // bool_return is refractor to reduce cyclomatic complexity
	}

	private static boolean bool_return(boolean flag) {
		if (flag == false) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Tester test = new Tester();
		test.testcode();
	}

}
