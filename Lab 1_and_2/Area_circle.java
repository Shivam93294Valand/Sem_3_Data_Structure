import java.util.Scanner;

public class Area_circle {
    public static void main(String[] args) {
        System.out.println("Enter Radious: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();
        double area = Math.PI * r * r;
        System.out.println("The area of circle =" + area);
    }
}