package Loops;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int sp = n-1;
//		int st = (n/2)+1;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				if(i==j) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
				
			}
			
			
//			sp--;
			System.out.println();
		}
	}

}
