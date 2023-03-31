package Loops;

import java.util.Scanner;

public class Pattern_13_comb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i=0; i<n; i++) {
			int icj = 1;
			for(int j=0; j<=i; j++) {
				System.out.print(icj + "\t");
				int icjp1 = icj * (i-j)/(j+1);
				icj = icjp1;
			}
			System.out.println();
		}
	}

}
