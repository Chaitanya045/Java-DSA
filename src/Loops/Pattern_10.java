package Loops;

import java.util.Scanner;

public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int osp = n/2;
		int isp = -1;
		//int st = (n/2)+1;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=0; j<osp; j++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			for(int k=0; k<isp; k++) {
				System.out.print("\t");
			}
			if(i>1 && i<n) {
				System.out.print("*\t");
			}
			
			if(i<=n/2) {
				osp--;
				isp+=2;
			}else {
				osp++;
				isp-=2;
			}
			System.out.println();
		}
	}

}
