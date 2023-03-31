package Functions;

import java.util.Scanner;

public class Digits_Frequency {
	
	public static void digitsFrequency(int dig, int num) {
		int count = 0;
		while(num>0) {
			if(dig==num%10) {
				count++;
			}
			num=num/10;
		}
		System.out.println(dig+" repeated "+count+" times" );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dig = sc.nextInt();
		digitsFrequency(dig,num);
	}

}
