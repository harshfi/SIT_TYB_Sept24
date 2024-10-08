package Lec_3;

public class SQRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=(int)Math.pow(10, 5);//10^8
//		System.out.println(n*n);
		
       System.out.println(sqrt(22));
	}
	
	public static int sqrt(int x) {
		long s=1;
		long e=x;
		
		while(s<=e) {
			long mid=(s+e)/2;
			if(mid*mid==x) return (int)mid;
			
			else if(mid*mid> x) e=mid-1;
			else s=mid+1;
			
		}
		return (int)e;
	}

}
