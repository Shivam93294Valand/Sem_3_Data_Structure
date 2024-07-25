import java.util.ArrayList;
import java.util.Scanner;

public class Student_Detail {
    int Enrollment_No;
    String Name;
    int Sem;
    double CPI;

    public Student_Detail(int Enrollment_No, String Name, int Sem, double CPI) {
        this.Enrollment_No = Enrollment_No;
        this.Name = Name;
        this.Sem = Sem;
        this.CPI = CPI;
    }

    public void displayDetails() {
        System.out.println("Enrollment No: " + Enrollment_No);
        System.out.println("Name: " + Name);
        System.out.println("Sem: " + Sem);
        System.out.println("CPI: " + CPI);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student_Detail> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Student " + (i + 1) + " Details:");
            System.out.print("Enter Enrollment No: ");
            int Enrollment_No = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String Name = sc.nextLine();

            System.out.print("Enter Sem: ");
            int Sem = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter CPI: ");
            double CPI = sc.nextDouble();

            Student_Detail student = new Student_Detail(Enrollment_No, Name, Sem, CPI);
            students.add(student);

            System.out.println();
        }

        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student " + (i + 1) + " Details:");
            students.get(i).displayDetails();
            System.out.println();
        }

        sc.close();
    }
}