package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void input(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
	}
	
	public static void print(int[] arr) {
		for(int val: arr) {
			System.out.print(val+ " ");
		}
	}

	public static void stockSpan(int[] arr) {
		int[] nge = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		for(int i=1; i<arr.length; i++) {
			while(st.size()>0 && arr[i]>arr[st.peek()]) {
				nge[st.peek()] = arr[i];
				st.pop();
			}
			st.push(arr[i]);
			
		}
		
		while(st.size()>0) {
			nge[st.peek()] = -1;
			st.pop();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int arr[] = new int[n];
		input(arr);
		stockSpan(arr);
	}

}
