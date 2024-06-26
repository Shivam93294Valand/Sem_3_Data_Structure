import java.util.Scanner;

public class loc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.err.print("Enter a [" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        int small_loc = 1, large_loc = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                small_loc = i+1;
            }
            if (arr[0] < arr[i]) {
                large_loc = i+1;
            }
        }
        System.out.println("The position of smallest num is = " + small_loc + " and largest num is = " + large_loc);
    }
}