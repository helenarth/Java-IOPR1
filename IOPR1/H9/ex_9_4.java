import java.util.Scanner;

public class ex_9_4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Enter a string followd by a character: ");

		String s = input.nextLine();

		// System.out.println(count(new char[] { 'W', 'e', 'l', 'c', 'o', 'm',
		// 'E' }, 'e'));

		// invoke

		int[] counts = countLetters(s.toLowerCase());

		for (int i = 0; i < counts.length; i++) {

			System.out.println((char) ('a' + i) + " appears " + counts[i]
					+ ((counts[i] == 1) ? " time" : " times"));

		}

	}

	private static int[] countLetters(String s) {

		int[] counts = new int[26];

		for (int i = 0; i < s.length(); i++) {

			if (Character.isLetter(s.charAt(i)))
				counts[s.charAt(i) - 'a']++;

		}
		return counts;

	}
}
