package vitals;
import java.util.HashMap;
import java.util.Map;

public class VitalTypes {
	public static Map<String, int[]> vitaltypes = new HashMap<>();

	static {
		vitaltypes.put("bpm", new int[] { 70, 150 });
		vitaltypes.put("spo2", new int[] { 90, 100 });
		vitaltypes.put("respRate", new int[] { 30, 95 });
	}

	public Map<String, int[]> getMap() {
		return vitaltypes;
	}
}