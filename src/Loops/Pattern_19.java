package Loops;

import java.util.Scanner;

public class Pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int st = n;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				if(i==1 && (j==n || j<=(n/2)+1)){
					System.out.print("*\t");
				}else if(i<=n/2 && (j==n || j==(n/2)+1)) {
					System.out.print("*\t");
				}else if(i==(n/2)+1) {
					System.out.print("*\t");
				}else if(i>(n/2)+1 && (j==1 || j==(n/2)+1)) {
					System.out.print("*\t");
				}else if(i==n && (j==1 || j>=(n/2)+1)) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}	

}
