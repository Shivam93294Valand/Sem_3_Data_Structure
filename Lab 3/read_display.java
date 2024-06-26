import java.util.Scanner;

public class read_display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a [" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array [" + i + "]" + arr[i]);
        }
    }
}