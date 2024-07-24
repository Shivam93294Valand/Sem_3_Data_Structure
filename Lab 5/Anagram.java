import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		String[] arr = str.split(" ");

		int RanNum = (int) (Math.random() * arr.length);
		System.out.println(arr[RanNum]);

		System.out.print("Enter a Anagram of " + arr[RanNum] + ": ");
		String str2 = sc.nextLine();

		if (isAnagram(arr[RanNum], str2)) {
			System.out.println(str2 + " is an anagram of " + arr[RanNum]);
		} else {
			System.out.println(str2 + " is not an anagram of " + arr[RanNum]);
		}

		sc.close();
	}

	public static boolean isAnagram(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}

		char[] charArray1 = word1.toCharArray();
		char[] charArray2 = word2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);
	}
}