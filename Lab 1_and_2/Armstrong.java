// 1 to 1000 armstrong 
public class Armstrong {
    public static boolean isArmstrong(int a) {
        int temp = a;
        int count = 0, sum = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        a = temp;
        while (a > 0) {
            int rem = a % 10;
            sum = sum + (int) Math.pow(rem, count);
            a = a / 10;
        }
        return (sum == temp);
    }

    public static void main(String[] args) {
        int n = 1000;
        System.out.print("The Armstromg number between 1 to 1000 = ");
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + ",");
            }
        }
    }
}