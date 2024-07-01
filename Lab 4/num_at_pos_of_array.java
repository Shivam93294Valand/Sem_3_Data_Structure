import java.util.Scanner;

public class num_at_pos_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to insert: ");
        int num = sc.nextInt();
        System.out.print("Enter the position (0 to " + (n) + "): ");
        int pos = sc.nextInt();
        sc.close();
        int[] b = new int[n + 1];
        for (int i = 0; i < b.length; i++) {
            if (i < pos) {
                b[i] = a[i];
            } else if (i == pos) {
                b[i] = num;
            } else {
                b[i] = a[i - 1];
            }
        }
        System.out.print("After insert:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }
    }
}