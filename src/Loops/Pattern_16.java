package Loops;

import java.util.Scanner;

public class Pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = 2*(n-1);
		int k = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + "\t");
			}
			
			for(int j=0; j<sp-1; j++) {
				System.out.print("\t");
			}
			if(i==n) {
				k = i-1;
			}else {
				k = i;
			}
			for(int j=k; j>=1; j--) {
				System.out.print(j + "\t");
			}
			sp-=2;
			System.out.println();
		}
	}

}
