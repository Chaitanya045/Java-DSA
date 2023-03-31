package Loops;

import java.util.Scanner;

//Benjamin bulbs: in this problem there will be 100 bulbs for 1st voltage fluctuation multiples 
//of 1 will be toggles for 2nd multiples of 2 so we have to find which bulbs are turned on after 
//n toggles. So if we do the analysis only bulbs which are perfect squares are left turned on because
//they have odd number of factors

public class BenjaminBulbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i*i<=n; i++) {
			System.out.println(i*i);
		}
	}

}
