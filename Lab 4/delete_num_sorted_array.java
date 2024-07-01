import java.util.Scanner;

public class delete_num_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the num you want to delete: ");
        int del = sc.nextInt();
        sc.close();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("After deleting:");
        for (int i = 0; i < a.length; i++) {
            if (del == a[i]) {
                continue;
            } else {
                System.out.print(" " + a[i]);
            }
        }
    }
}