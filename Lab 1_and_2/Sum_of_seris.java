// series: 1 + (1+2) + (1+2+3) + (1+2+3+4)+ …+(1+2+3+4+….+n).
import java.util.Scanner;

public class Sum_of_seris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num:");
        int n = sc.nextInt();
        sc.close();
        int res = 0, sum_series = 0;
        for (int i = 1; i <= n; i++) {
            sum_series = sum_series + i;
            res = res + sum_series;
        }
        System.out.println("Sum of the series up to n = " + n + " is : " + res);
    }
}