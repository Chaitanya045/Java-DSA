package Loops;

import java.util.Scanner;

public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int osp = 0;
		int isp = 0;
		int st = n;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=osp; j++) {
				System.out.print("\t");
			}
			for(int j=1; j<=st; j++) {
				if(i>1 && i<=n/2 && j>1 && j<st) {
					System.out.print("\t");
				}else {
					System.out.print("*\t");
				}
				
			}
			if(i<=n/2) {
				st-=2;
				osp++;
			}else{
				st+=2;
				osp--;
			}
			System.out.println();
		}
	}	

}
