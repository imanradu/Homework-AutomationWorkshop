package week_2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMaps {
    public void hashMaps() {
        // 4. empty map with key=name and value=email
        System.out.println("\n");
        HashMap<String,String> nameEmail=new HashMap<>();
        nameEmail.put("Roxana", "p.r@yahoo.com");
        nameEmail.put("Dragos", "p.d@gmail.com");
        nameEmail.put("Radu", "i.r@mozilla.com");
        nameEmail.put("Maria", "i.m@yahoo.com");
        nameEmail.put("Bogdan", "p.b@yahoo.com");
        nameEmail.put("Liviu", "i.l@yahoo.com");
        System.out.println("\nThe size of the map is: " + nameEmail.size());
        System.out.println("Check by name: Radu => " + nameEmail.containsKey("Radu"));
        System.out.println("Check by email: i.m@yahoo.com => " + nameEmail.containsValue("i.m@yahoo.com"));
        System.out.println("Remove by key: Radu: " + nameEmail.remove("Radu"));
        System.out.println("The map is: "+ nameEmail);
        LinkedHashMap<String,String> sortedNameEmail=new LinkedHashMap<>();
        nameEmail.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(x -> sortedNameEmail.put(x.getKey(), x.getValue()));
        System.out.println("The map sorted by key: " + sortedNameEmail);
    }
}
