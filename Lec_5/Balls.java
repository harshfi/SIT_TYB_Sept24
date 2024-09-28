package Lec_5;

public class Balls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     take(4,"",0,0);
	}
	public static void take(int n,String ans,int r,int b) {
		if(n==0) {
			System.out.println(ans+" "+r+" "+b);
			return;
		}
		take(n-1,ans+"R",r+1,b);
		take(n-1,ans+"B",r,b+1);
	}
	

}
