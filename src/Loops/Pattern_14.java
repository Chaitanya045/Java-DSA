package Loops;

import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.print(n + " " + "*" + " " + i + " " + "=" + " " + n*i );
			System.out.println();
		}
	}

}
