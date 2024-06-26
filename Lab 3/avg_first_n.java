import java.util.Scanner;

public class avg_first_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0, avg;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        avg = sum / n;
        System.out.println("The average of 1 to " + n + " = " + avg);
    }
}