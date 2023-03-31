package NumberSystems;

import java.util.Scanner;

public class DecimalToAnyBase {
	
	public static void decimalToAnyBase(int num, int base) {
		int dig=0;
		int bnum = 0;
		int count = 0;
		while(num>0) {
			dig = num%base;
			num = num/base;
			bnum += dig*Math.pow(10, count);
			count++;
		}
		System.out.println("Converted number in base "+base+ " is "+ bnum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base = sc.nextInt();
		decimalToAnyBase(num, base);
	}

}
