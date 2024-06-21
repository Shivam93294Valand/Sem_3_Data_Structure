import java.util.Scanner;

public class Second_conv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a seconds: ");
        int second = sc.nextInt();
        sc.close();
        int min = 0, hour = 0;
        for (int i = 1; i <= second; i++) {
            if (second >= 3600) {
                second = second - 3600;
                hour++;

            }
            if (second >= 60) {
                second = second - 60;
                min++;
            }
        }
        System.out.println(hour + ":" + min + ":" + second);
    }
}