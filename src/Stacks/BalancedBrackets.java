package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='(') {
				st.push(ch);
			}
			if(ch==')') {
				if(st.size()==0) {
					System.out.println("False");
					return;
				}
				else {
					if(st.peek()=='(') {
						st.pop();
					}else {
						System.out.println("False");
						return;
					}
				}
				
			}
			
			if(ch=='{') {
				st.push(ch);
			}
			if(ch=='}') {
				if(st.size()==0) {
					System.out.println("False");
					return;
				}else {
					if(st.peek()=='{') {
						st.pop();
					}else {
						System.out.println("False");
						return;
					}
				}
				
			}
			
			if(ch=='[') {
				st.push(ch);
			}
			if(ch==']') {
				if(st.size()==0) {
					System.out.println("False");
				}else {
					if(st.peek()=='[') {
						st.pop();
					}else {
						System.out.println("False");
						return;
					}
				}
				
			}
		}
		
		if(st.size()!=0) {
			System.out.println("False");
			return;
		}
		System.out.println("True");
	}
}
