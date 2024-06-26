import java.util.Scanner;

public class replice_arr_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.err.print("Enter a [" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter 1st num: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd num: ");
        int n2 = sc.nextInt();
        sc.close();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n1) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The updated index: " + index);
            arr[index] = n2;
            System.out.print("The updated array = ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("The 1st num is not in the array");
        }
    }
}