package week7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMod {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = new int[20];
		int i, n, edit;
		String cond;

		System.out.println("Enter 20 integers --> ");
		for (i = 0; i < 20; i++) {
			array[i] = userinput.nextInt();
		}

		System.out.println("Your array is: ");
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		userinput.nextLine();

		System.out.println("\nWould you like to edit the array? Yes/No");
		cond = userinput.nextLine();

		while (cond.equals("Yes")) {
			System.out.println("What number would you like to edit?");
			n = userinput.nextInt();
			userinput.nextLine();
			edit = Arrays.binarySearch(array, n);
			System.out.println("Enter the integer you would like to replace it with. -->");
			array[edit] = userinput.nextInt();
			userinput.hasNextLine();
			userinput.nextLine();
			System.out.println("Your new array is: ");
			for (i = 0; i < array.length; i++) {
				System.out.print(array[i] + ", ");
			}
			System.out.println("\nWould you like to edit the array? Yes/No");
			cond = userinput.nextLine();
		}
	}

}
