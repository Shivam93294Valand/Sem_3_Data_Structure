import java.util.Scanner;

public class Day_conv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a days:");
        int day = sc.nextInt();
        int year = 0, week = 0;
        sc.close();
        for (int i = 1; i <= day; i++) {
            if (day >= 365) {
                day = day - 365;
                year++;
            }
            if (day >= 7) {
                day = day - 7;
                week++;
            }
        }
        System.out.println(year + " Years ," + week + " weeks ," + day + " days.");
    }
}