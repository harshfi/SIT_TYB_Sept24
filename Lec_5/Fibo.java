package Lec_5;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(6));

	}
	public static int fibo(int n) {
		//base case
		if(n==0) return 0;
		if(n==1) return 1;
		int prev=fibo(n-1);
		int prevKaprev=fibo(n-2);
		return prev+prevKaprev;
		
	}

}
