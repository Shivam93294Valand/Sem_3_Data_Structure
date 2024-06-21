import java.util.Scanner;

public class Vowel_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vowel or Consonant: ");
        String str = sc.next();
        str = str.toLowerCase();
        sc.close();
        char c = str.charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("The entered charcter is vowel.");
        } else {
            System.out.println("The entered charcter is not vowel.");
        }
    }
}