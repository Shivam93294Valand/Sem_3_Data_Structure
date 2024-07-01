import java.util.Scanner;

public class insert_num_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Enter a number: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to insert: ");
        int num = sc.nextInt();
        sc.close();
        a[n] = num;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("After insert:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
}