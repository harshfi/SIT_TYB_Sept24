package Lec_2;

public class Arm_5_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=10000;i<100000;i++) {
			if(isArm(i,5)==true)System.out.println(i);
		}

	}
	
	public static boolean isArm(int n, int cnt) {
		int sum=0;
		int temp=n;
		while(temp>0) {
			int d= temp%10;
			sum=sum+(int)Math.pow(d, cnt);
			temp=temp/10;
		}
		
		return sum==n;
	}
	public static int count(int n) {
		int cnt=0;
		while(n>0) {
			cnt++;
			n=n/10;
		}
		return cnt;
	}


}
