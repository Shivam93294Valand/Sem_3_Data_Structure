import java.util.Scanner;

public class Swap{
	public static void Swap(int num1, int num2) {
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num1: ");
		int num1 = sc.nextInt();

		System.out.print("Enter a num2: ");
		int num2 = sc.nextInt();

		Swap(num1, num2);
	}
}