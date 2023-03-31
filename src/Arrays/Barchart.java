package Arrays;

import java.util.Scanner;

public class Barchart {

	static Scanner sc = new Scanner(System.in);
	public static void input(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static void barChart(int a[]) {
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		for(int i=0; i<max; i++) {
			for(int j=0; j<a.length; j++) {
				if(i<max-a[j]) {
					System.out.print("\t");
				}else {
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int arr[] = new int[n];
		input(arr);
		System.out.println("Barchart:");
		barChart(arr);
	}

}
