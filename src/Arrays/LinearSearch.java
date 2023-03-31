package Arrays;

import java.util.Scanner;

public class LinearSearch {

	static Scanner sc = new Scanner(System.in);
	
	public static void input(int input[]) {
		
		System.out.println("Enter the array elements");
		for(int i=0; i<input.length; i++) {
			input[i] = sc.nextInt();
		}
	}
	
	public static void linearSearch(int input[], int k) {
		int flag = 0;
		for(int i=0; i<input.length; i++) {
			if(input[i]==k) {
				flag=1;
				System.out.println("Element found at index " + i);
				break;
			}
		}
		if(flag==0) {
			System.out.println("Element not found");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no.of Elements");
		int n = sc.nextInt();
		int arr[] = new int[n];
		input(arr);
		System.out.println("Enter the key to find");
		int key = sc.nextInt();
		linearSearch(arr, key);
		
	}

}
