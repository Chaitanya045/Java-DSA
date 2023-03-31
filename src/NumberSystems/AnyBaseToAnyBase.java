package NumberSystems;

import java.util.Scanner;

public class AnyBaseToAnyBase {
	
	public static int decimalToAnyBase(int num, int base) {
		int dig=0;
		int bnum = 0;
		int count = 0;
		while(num>0) {
			dig = num%base;
			num = num/base;
			bnum += dig*Math.pow(10, count);
			count++;
		}
		return bnum;
	}
	
	public static int anyBaseToDecimal(int num, int base) {
		int dig=0;
		int bnum = 0;
		int count = 0;
		while(num>0) {
			dig = num%10;
			num = num/10;
			bnum += dig*Math.pow(base, count);
			count++;
		}
		return bnum;
	}
	
	public static void anyBaseToAnyBase(int num, int base1, int base2) {
		int decnum = anyBaseToDecimal(num, base1);
		int fnum = decimalToAnyBase(decnum, base2);
		System.out.println("Converted number in base "+ base2 + " is "+ fnum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base1 = sc.nextInt();
		int base2 = sc.nextInt();
		anyBaseToAnyBase(num, base1, base2);
	}

}
