package Loops;

import java.util.Scanner;

public class GcdAndLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int on1 = sc.nextInt();
		int on2 = sc.nextInt();
		int n1 = on1;
		int n2 = on2;
		
		while(n1%n2!=0) {
			int rem = n1%n2;
			n1 = n2;
			n2 = rem;
		}
		
		int gcd = n2;
		int lcm = (on1 * on2)/gcd;
		
		System.out.println("GCD and LCM are " + gcd + " and " + lcm);
	}

}
