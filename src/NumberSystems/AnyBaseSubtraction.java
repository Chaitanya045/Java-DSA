package NumberSystems;

import java.util.Scanner;

public class AnyBaseSubtraction {
	
	public static void anyBaseSubtraction(int num1, int num2, int base) {
		int dig = 0;
		int carry = 0;
		int sum = 0;
		int count = 0;
		while(num1>0) {
			int d1 = num1%10;
			int d2 = num2%10;
			num1 = num1/10;
			num2 = num2/10;
			d1+=carry;
			if(d1>=d2) {
				carry=0;
				dig = d1-d2;
			}else {
				carry = -1;
				dig = d1-d2+base;
			}
			sum +=dig*Math.pow(10, count);
			
			count++;
		}
		System.out.println("Sum is "+ sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		anyBaseSubtraction(num1, num2, base);
	}

}
