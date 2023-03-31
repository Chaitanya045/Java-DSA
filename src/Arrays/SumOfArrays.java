package Arrays;

import java.util.Scanner;

public class SumOfArrays {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void input(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static void print(int a[]) {
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
		for(int val: a) {
			System.out.println(val);
		}
	}
	
	public static void sum(int a1[], int a2[]) {
		int sum[] = new int[a1.length>a2.length?a1.length:a2.length];
		int c=0;
		int i = a1.length-1;
		int j = a2.length-1;
		int k = sum.length-1;
		while(k>=0) {
			int d=c;
			if(i>=0) {
				d+=a1[i];
			}
			
			if(j>=0) {
				d+=a2[j];
			}
			
			c=d/10;
			d=d%10;
			
			sum[k] = d;
			
			i--;
			j--;
			k--;
		}
		if(c!=0) {
			System.out.println(c);
		}
		print(sum);
	}
	
	public static void main(String[] args) {
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		input(arr1);
		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		input(arr2);
		System.out.println("Sum:");
		sum(arr1,arr2);
	}
}
