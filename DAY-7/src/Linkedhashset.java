import java.util.LinkedHashSet;
import java.util.Scanner;

public class Linkedhashset {
    public static void main(String[] args){
        LinkedHashSet lh=new LinkedHashSet();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no. of employees in the company: ");
        int n=scanner.nextInt();
        System.out.println("Enter the  employee number of each employee:");
        for(int i=1;i<=n;i++) {
            lh.add(scanner.nextInt());
        }
        System.out.println("Total number of employees in the company:"+  lh.size());
        System.out.println("Employees with employee numbers"+ lh);
        System.out.println("Enter the employee number to be searched: ");
        int x= scanner.nextInt();
        if(lh.contains(x)){
            System.out.println("Employee "+x + " authentication successful.");
        }
        else{
            System.out.println(x+ " not a valid employee");
        }
    }
}