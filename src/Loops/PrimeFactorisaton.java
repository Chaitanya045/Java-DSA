package Loops;

import java.util.Scanner;

public class PrimeFactorisaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2; i*i<n; i++) {
			while(n%i == 0) {
				n = n/i;
				System.out.println(i);
			}
		}
		if(n!=1) {
			System.out.println(n);
		}
	}

}
