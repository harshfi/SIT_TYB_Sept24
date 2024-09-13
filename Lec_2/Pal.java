package Lec_2;

import java.util.*;

public class Pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner h = new Scanner(System.in);
		int n = h.nextInt();
		System.out.println(isPal(n));

	}
	public static boolean isPal(int n) {
		int rev=0;
		int temp=n;
		while(temp>0) {
			int d= temp%10;
			rev=rev*10+d;
//			System.out.println(temp);
			temp=temp/10;
		}
		
		return rev==n;
	}

}
