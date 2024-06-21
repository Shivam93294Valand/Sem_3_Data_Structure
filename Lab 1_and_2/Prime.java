import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("The number " + n + " is prime");
        } else {
            System.out.println("The number " + n + " is not prime");
        }
    }
}