import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<Integer,String> treemap= new java.util.TreeMap<Integer, String>(Collections.reverseOrder());

        System.out.println("Enter the name of students in decreasing order of their height:");
        treemap.put(163,"Sneha");
        treemap.put(168,"Sandra");
        treemap.put(140,"Akshay");
        treemap.put(160,"Kavitha");
        treemap.put(170,"Pradeep");
       // treemap.replace(160,"Kavitha","Hari");

        for(Map.Entry<Integer,String> map: treemap.entrySet()){
            System.out.println(map.getKey()+"-->"+map.getValue());
                }

    }
}
