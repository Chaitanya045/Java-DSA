package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementToTheRight {
	
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
	
	public static void nextGreaterElementToTheRight(int[] arr) {
		int nge[] = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		st.push(arr[arr.length-1]);
		nge[arr.length-1] = -1;
		for(int i=arr.length-2; i>=0; i--) {
			while(st.size()>0 && arr[i]>=st.peek()) {
				st.pop();
			}
			if(st.size()==0) {
				nge[i] = -1;
			}else {
				nge[i] = st.peek();
			}
			
			st.push(arr[i]);
			
		}
		
		print(nge);
	}

	public static void nextGreaterElementToTheRight2(int[] arr) {
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
		nextGreaterElementToTheRight(arr);
	}

}
