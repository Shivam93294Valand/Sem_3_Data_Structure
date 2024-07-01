import java.util.Scanner;

public class marge_two_unsortArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array 1: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter a number: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array 2: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter a number: ");
            b[i] = sc.nextInt();
        }
        sc.close();
        int cLen = a.length + b.length;
        int ln = 0;
        int[] c = new int[cLen];
        for (int i = 0; i < c.length; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else {
                c[i] = b[ln];
                ln++;
            }
        }
        System.out.print("Marged array: ");
        for (int i = 0; i < c.length; i++){
            System.out.print(c[i]+" ");
        }
    }
}