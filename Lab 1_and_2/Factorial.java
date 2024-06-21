import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        System.out.println("The factorial of " + n + " is = " + res);
    }
}