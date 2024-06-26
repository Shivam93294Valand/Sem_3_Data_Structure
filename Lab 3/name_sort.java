import java.util.Scanner;
import java.util.Arrays;

public class name_sort {
    public static void main(String[] args) {
        System.out.print("Enter a number of name: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a name of " + (i + 1) + " = ");
            arr[i] = sc.next();
        }
        sc.close();
        Arrays.sort(arr);
        System.out.println("Sorted names:");
        for (String name : arr) {
            System.out.println(name);
        }
    }
}