package Vitals;
import java.util.HashMap;
import java.util.Map;

public class Tester {

	public void testcode() {
		Map<String, Integer> test_map = new HashMap<>();
		
		test_map.put("bpm", 80);
		test_map.put("spo2", 97);
		test_map.put("respRate", 40);
		assert(Main.vitalsAreOk(test_map) == true);
		test_map.clear();
		
		test_map.put("bpm", 50);
		test_map.put("spo2", 95);
		test_map.put("respRate", 70);
		assert (Main.vitalsAreOk(test_map) == false);
		test_map.clear();
		
		test_map.put("bpm", 160);
		test_map.put("spo2", 95);
		test_map.put("respRate", 70);
		assert (Main.vitalsAreOk(test_map) == false);
		test_map.clear();
		
		test_map.put("bpm", 100);
		test_map.put("spo2", 50);
		test_map.put("respRate", 70);
		assert (Main.vitalsAreOk(test_map) == false);
		test_map.clear();
		
		test_map.put("bpm", 100);
		test_map.put("spo2", 95);
		test_map.put("respRate", 25);
		assert (Main.vitalsAreOk(test_map) == false);
		test_map.clear();
		
		test_map.put("bpm", 100);
		test_map.put("spo2", 95);
		test_map.put("respRate", 100);
		assert (Main.vitalsAreOk(test_map) == false);
		test_map.clear();
		
		System.out.println("All tests Passed Congratulations");
	}

}
