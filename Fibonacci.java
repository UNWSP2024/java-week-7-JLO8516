package week7;

import java.util.Scanner;

public class Fibonacci {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		int n,i;
		
		System.out.println("How many Fibonacci numbers would you like? --> ");
		n = userinput.nextInt();
		
		int[] sequence = new int[n];
		
		sequence[0] = 0;
		sequence[1] = 1;
		
		System.out.print(sequence[0] + ", ");
		System.out.print(sequence[1] + ", ");
		
		for(i=2; i<n; i++) {
			sequence[i] = sequence[i-1] + sequence[i-2];
			System.out.print(sequence[i] + ", ");
		}
	}

}
