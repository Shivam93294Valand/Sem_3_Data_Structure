import java.util.Scanner;

public class Matrix_Multiplyction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[][] = new int[3][2];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Enter arr1[" + i + "][" + j + "] :");
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		int arr2[][] = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Enter arr2[" + i + "][" + j + "] :");
				arr2[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		int arr3[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr3[i][j] = 0;
				for(int k=0;k<2;k++){
					arr3[i][j] += arr1[i][k] * arr2[k][j]; 
				}
				System.out.print("\t" + arr3[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}