import java.util.Scanner;

public class pascal_tringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num of: ");
        int n = sc.nextInt();
        sc.close();
        int a[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < i; j++) {
                if (i == j || j == 0) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
    }
}