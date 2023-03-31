package Loops;

import java.util.Scanner;

public class Pattern_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int k=0; k<n-i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i=1; i<=n-1; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=0; j<=(n-i-1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
