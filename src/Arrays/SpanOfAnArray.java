package Arrays;

import java.util.Scanner;

public class SpanOfAnArray {
	static Scanner sc = new Scanner(System.in);
	public static void input(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static void span(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			} 
		}
		
		int span = max - min;
		System.out.println("Span is "+span);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int arr[] = new int[n];
		input(arr);
		span(arr);
	}

}
