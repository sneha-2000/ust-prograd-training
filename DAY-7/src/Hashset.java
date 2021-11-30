import java.util.HashSet;
import java.util.Scanner;

public class Hashset {
    public static void main(String[] args){
        HashSet<Integer> hs=new HashSet();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n= scanner.nextInt();
        System.out.println("");
        while(n!=0){
            hs.add(scanner.nextInt());
            n--;
        }
        System.out.println(hs);
        System.out.println("Roll number that going to call");
        int t=scanner.nextInt();
        if(hs.contains(t)){
            System.out.println("work submitted by roll number:"+ t);
            hs.remove(t);
        }
        System.out.println(hs);


    }
}