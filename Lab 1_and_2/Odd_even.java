import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        System.out.print("Enter a num: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }
    }
}