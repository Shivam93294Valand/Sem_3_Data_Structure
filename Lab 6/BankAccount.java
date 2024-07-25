import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    int actNo;
    double balance;
    String accountHolder;
    String Name;

    public BankAccount(int actNo, double balance, String accountHolder, String Name) {
        this.actNo = actNo;
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.Name = Name;
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.print("After deposit ");
        checkBalance();
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Not sufficient amount to withdraw");
            return;
        } else {
            balance -= amount;
            System.out.print("After withdraw ");
            checkBalance();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of members: ");
        int num = sc.nextInt();

        ArrayList<BankAccount> Member = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter Member " + (i + 1) + " Details:");

            System.out.print("Enter actNo: ");
            int actNo = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter balance: ");
            double balance = sc.nextDouble();
            sc.nextLine(); 

            System.out.print("Enter accountHolder: ");
            String accountHolder = sc.nextLine();

            System.out.print("Enter Name: ");
            String Name = sc.nextLine();

            Member.add(new BankAccount(actNo, balance, accountHolder, Name));
            System.out.println();
        }

        for (int i = 0; i < Member.size(); i++) {
            System.out.println("Member " + (i + 1) + " Details:");
            Member.get(i).checkBalance();
            Member.get(i).deposit(1000);
            Member.get(i).withdraw(500);
            Member.get(i).checkBalance();
            System.out.println();
        }
        sc.close();
    }
}