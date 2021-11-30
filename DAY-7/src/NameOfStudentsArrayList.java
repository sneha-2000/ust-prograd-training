import java.util.ArrayList;
import java.util.List;

public class NameOfStudentsArrayList {
    public static void main(String[] args) {
        ArrayList<String> StudentName= new ArrayList<String>();
        ArrayList<String> StudentName2= new ArrayList<String>(List.of("Sakshi,Chetna,Anupama,Seher"));
        StudentName.add("Sneha");
        StudentName.add("Anupama");
        StudentName.add("Rashi");
        StudentName.add(3,"Charu");
        StudentName.addAll(StudentName2);
        System.out.println(StudentName);
        StudentName.remove(2);
        System.out.println(StudentName);

    }
}
