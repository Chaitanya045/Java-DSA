package Arrays;

import java.util.Scanner;

public class DifferenceOfArrays {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void input(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static void print(int a[]) {
		int i = 0;
		while(i<a.length) {
			if(a[i]==0)
				i++;
			else
				break;
		}
		
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
	}
	
	public static void difference(int a1[], int a2[]) {
		int dif[] = new int[a1.length>a2.length?a1.length:a2.length];
		int c=0;
		int i = a1.length-1;
		int j = a2.length-1;
		int k = dif.length-1;
		while(k>=0) {
			int d=0;
			int a1v = i>=0?a1[i]:0;
			if(a2[j]+c>=a1v) {
				d = a2[j]+c-a1v;
				c=0;
			}else {
				d = a2[j]+c-a1v+10;
				c=-1;
			}
			
			dif[k] = d;
			
			i--;
			j--;
			k--;
		}
			print(dif);
	}
	
	public static void main(String[] args) {
		int n1 = sc.nextInt();
		int arr1[] = new int[n1];
		input(arr1);
		int n2 = sc.nextInt();
		int arr2[] = new int[n2];
		input(arr2);
		System.out.println("Difference:");
		difference(arr1,arr2);
	}
}
