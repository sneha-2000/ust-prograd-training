import java.util.Scanner;

public class SwapElementsOfArray {
        public static void main(String args[]) {
        //input from the user
            int i, t,n;
            int arr[] = new int[5];

            Scanner sc = new Scanner(System.in);

        //length of array
            n = sc.nextInt();
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            i = 0;
            while (i < n - 1) {
                t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
                i = i + 2;
            }
            //printing the array
            System.out.print("After swap list are:");
            for (i = 0; i < n; i++) {
                System.out.print(" " + arr[i]);
            }

        }
    }
