package collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> config = new HashMap<>();
		
		config.put("browser", "chrome");
		config.put("url", "https://google.com");
		config.put("timeout", "30");
		config.put("headless", "false");
		config.put("browser", "firefox");
		
		System.out.println("Entire config : " + config);
		
		System.out.println("Value of url : " + config.get("url"));
		
		System.out.println("Does timeout exist? " + config.containsKey("timeout"));
		
		config.remove("headless");
		System.out.println("Updated config : " + config);
		
		System.out.println("\nLoop using entry set");
		for(Map.Entry<String, String> entry : config.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
        System.out.println("\nLoop using entry set");
		for(Map.Entry<String, String> entry : config.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}
