package NumberSystems;

import java.util.Scanner;

public class AnyBaseToDecimal {
	
	public static void anyBaseToDecimal(int num, int base) {
		int dig=0;
		int bnum = 0;
		int count = 0;
		while(num>0) {
			dig = num%10;
			num = num/10;
			bnum += dig*Math.pow(base, count);
			count++;
		}
		System.out.println("Converted number to decimal is "+ bnum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base = sc.nextInt();
		anyBaseToDecimal(num, base);
	}

}
