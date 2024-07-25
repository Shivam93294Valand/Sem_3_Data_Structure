import java.util.Scanner;

public class Temp_Conve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for celsius to fahrenhit\nEnter 2 for fahrenhit to celsius");
		int num = sc.nextInt();
		if(num == 1) {
			System.out.print("Enter temprature in celsius :");
			double celsious = sc.nextDouble();
			double fahrenhit = (celsious * 9/5) + 32;
			System.out.print("temprature in fahrenhit = "+ fahrenhit);
		}
		else if (num == 2) {
			System.out.print("Enter celsius in fahrenhit :");
			double fahrenhit = sc.nextDouble();
			double celsious = (fahrenhit - 32) * (5.0/9);
			System.out.print("temprature in celsius = "+ celsious);
		}
		else {
			System.out.println("Plese Enter number 1 or 2.");
		}
	}
}