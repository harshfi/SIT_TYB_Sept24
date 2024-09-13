package Lec_2;

public class Pal_100_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=100;i<=10000;i++) {
			if(isPal(i)==true) {
				System.out.println(i);
			}
		}

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
