import java.util.Map;

public class HashMap {
    public static void main(String[] args){
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        map.putIfAbsent("saurav", 40);// To check whether "saurav" is present or not
        map.replace("sachin", 30, 50);

        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
    }

}





