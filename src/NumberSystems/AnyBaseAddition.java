package NumberSystems;

import java.util.Scanner;

public class AnyBaseAddition {
	
	public static void anyBaseAddition(int num1, int num2, int base) {
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
		System.out.println("Sum is "+ sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		anyBaseAddition(num1, num2, base);
	}

}
