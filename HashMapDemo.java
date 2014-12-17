import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class HashMapDemo {
	public static void main (String [] args){
		System.out.println("Demo Hashmaps");
		
		singleKeySingleValue();
		singleKeyListValue();
	}

	public static void singleKeySingleValue(){
		// Initialize HashMap
		Map<String, String> map = new HashMap<String, String>();

		// Add Key, Value pair
		map.put("A", "1");

		// Print values in HashMap
		System.out.println("Fetching Keys and corresponding Values");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key = " + key);
			System.out.println("Value = " + value);
		}

		// Update Value for Key
		map.put("A", "2");

		// Print values in HashMap
		System.out.println("Fetching Keys and corresponding Values");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key = " + key);
			System.out.println("Value = " + value);
		}

		// Remove Key
		map.remove("A");

		// Print values in HashMap
		System.out.println("Fetching Keys and corresponding Values");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key = " + key);
			System.out.println("Value = " + value);
		}
	}

	public static void singleKeyListValue(){
		// Initialize HashMap
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> valSetOne = new ArrayList<String>();
		valSetOne.add("Apple");
		valSetOne.add("Aeroplane");
		
		// create list two and store values
		List<String> valSetTwo = new ArrayList<String>();
		valSetTwo.add("Bat");
		valSetTwo.add("Banana");
		
		// create list three and store values
		List<String> valSetThree = new ArrayList<String>();
		valSetThree.add("Cat");
		valSetThree.add("Car");
		
		// put values into map
		map.put("A", valSetOne);
		map.put("B", valSetTwo);
		map.put("C", valSetThree);
		
		// iterate and display values
		System.out.println("Fetching Keys and corresponding List Values");
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
		String key = entry.getKey();
			List<String> values = entry.getValue();
			System.out.println("Key = " + key);
			System.out.println("Values = " + values);
		}
	}
}