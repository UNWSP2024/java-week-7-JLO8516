package week7;

import java.util.Scanner;

public class Pascal {

	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] tri = new int[10][10];
		int y,x,i;
		
		tri[0][0] = 1;
		tri[0][1] = 0;
		tri[0][2] = 0;
		tri[0][3] = 0;
		tri[0][4] = 0;
		tri[0][5] = 0;
		tri[0][6] = 0;
		tri[0][7] = 0;
		tri[0][8] = 0;
		tri[0][9] = 0;

		
		for(i=0; i<10; i++) {System.out.format("%3d ", tri[0][i]);}
		System.out.println();
		for(y=1; y<10; y++) {
			for(x=0; x<10; x++) {
				if(x == 0) {tri[y][x] = 1;}
				else {
					tri[y][x] = tri[y-1][x] + tri[y-1][x-1];
				}
				System.out.format("%3d ", tri[y][x]);
			}System.out.println();
		}
		
	}

}
