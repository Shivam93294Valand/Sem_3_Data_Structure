import java.util.Scanner;

public class sum_m_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a start num: ");
        int m = sc.nextInt();
        System.out.print("Enter a end num: ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of " + m + " to " + n + " is = " + sum);
    }
}