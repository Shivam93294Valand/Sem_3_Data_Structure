import java.util.Scanner;

public class Facto_rec {
    static int facto(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * facto(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int res = facto(n);
        System.out.println("The factorial of " + n + " is = " + res);
    }
}