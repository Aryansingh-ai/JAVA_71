package UNIT_3;
import java.util.HashMap;
import java.util.Map;

class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("First", 1);
        hm.put("Second", 2);
        hm.put("Third", 3);

        System.out.println(hm.get("First"));         // Prints value of "First"
        System.out.println(hm.containsKey("Second")); // Checks if key exists
        System.out.println(hm.keySet());              // Prints all keys
        System.out.println(hm.values());              // Prints all values
        System.out.println(hm.containsValue(2));      // Checks if value exists

        // Correct for-each loop to iterate through entries
        for (Map.Entry<String, Integer> hm1 : hm.entrySet()) {
            System.out.println(hm1.getKey() + " : " + hm1.getValue());
        }
    }
}
