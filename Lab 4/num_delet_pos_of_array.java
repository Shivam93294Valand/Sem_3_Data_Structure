import java.util.Scanner;

public class num_delet_pos_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the position of num you want to delete (0 to " + (n - 1) + "): ");
        int pos = sc.nextInt();
        sc.close();
        System.out.print("After delete:");
        for (int i = 0; i < a.length; i++) {
            if (i == pos) {
                continue;
            } else {
                System.out.print(" " + a[i]);
            }
        }
    }
}
