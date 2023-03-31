package Loops;

import java.util.Scanner;

public class Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp = n-3;
		int nums = 1;
		int num = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=sp; j++) {
				System.out.print("\t");
			}
			int k = num;
			for(int j=1; j<=nums; j++) {
				System.out.print(k +"\t");
				if(j<=nums/2) {
					k++;
				}else {
					k--;
				}
			}
			if(i<=n/2) {
				sp--;
				nums+=2;
				num++;
			}else {
				sp++;
				nums-=2;
				num--;
			}
			System.out.println();
		}
	}

}
