package Loops;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = n/2;
		int st = 1;
		
		for(int i=1; i<=n; i++) {
			for(int k=0; k<sp; k++) {
				System.out.print("\t");
			}
			for(int j=0; j<st; j++) {
				System.out.print("*\t");
			}
			if(i<=n/2) {
				sp--;
				st+=2;
			}else {
				sp++;
				st-=2;
			}
			System.out.println();
		}
	}

}
