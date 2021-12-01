import java.util.LinkedHashMap;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<String,String> lhm= new LinkedHashMap<>();

        System.out.println("Enter the name of students from same school:");
        lhm.put("Seher","MES");
        lhm.put("Suraj","MES");
        lhm.put("Neeraj","MES");
        System.out.println(lhm);

        System.out.println("Enter the name of changed school by Suraj :");
        lhm.replace("Suraj","MES","K.V.");
        System.out.println(lhm.get("Suraj"));

        System.out.println("Updated students list is:");
        System.out.println(lhm);

    }
}
