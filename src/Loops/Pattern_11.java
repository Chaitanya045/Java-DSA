package Loops;

import java.util.Scanner;

public class Pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
		}
	}

}
