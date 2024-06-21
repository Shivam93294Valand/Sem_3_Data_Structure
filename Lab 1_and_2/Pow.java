import java.util.Scanner;

public class Pow {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        System.out.print("Enter a power: ");
        int pow = sc.nextInt();
        sc.close();
        int res = 1;
        for (int i = 1; i <= pow; i++) {
            res = res * n;
        }
        System.out.println("The power " + pow + " of " + n + " = " + res);
    }
}