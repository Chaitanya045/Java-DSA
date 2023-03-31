package NumberSystems;

import java.util.Scanner;

public class AnyBaseMultiplicaton {
	
	public static int anyBaseAddition(int num1, int num2, int base) {
		int dig = 0;
		int carry = 0;
		int sum = 0;
		int count = 0;
		while(num1>0 || num2>0 || carry>0) {
			dig = (carry + num1%10 + num2%10)%base;
			carry = (carry + num1%10 + num2%10)/base;
			sum +=dig*Math.pow(10, count);
			num1 = num1/10;
			num2 = num2/10;
			count++;
		}
		return sum;
	}
	
	public static int multiply(int num, int d2, int base) {
		int dig = 0;
		int carry = 0;
		int sum = 0;
		int count = 0;
		while(num>0 || carry>0) {
			int d1 = num%10;
			num = num/10;
			dig = (carry + (d1*d2))%base;
			carry = (carry + (d1*d2))/base;
			sum +=dig*Math.pow(10, count);
			count++;
		}
		return sum;
	}
	
	public static void anyBaseMultiplication(int num1, int num2, int base) {
		
		int product = 0;
		int p = 1;
		while(num2>0) {
			
			int d2 = num2%10;
			num2 = num2/10;
			int sprd = multiply(num1, d2, base);
			product = anyBaseAddition(product, sprd*p, base);
			p = p*10;
		}
		System.out.println("Product is "+ product);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		anyBaseMultiplication(num1, num2, base);
	}

}
