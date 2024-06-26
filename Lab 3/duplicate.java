import java.util.Scanner;

public class duplicate {
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
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag == true) {
            System.out.println("The array does not contain duplicate element.");
        } else {
            System.out.println("The array contain duplicate element.");
        }
    }
}