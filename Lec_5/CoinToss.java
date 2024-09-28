package Lec_5;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Toss(3,"");

	}
	public static void Toss(int n,String ans) {
		//base case
		if(n==0) {
			System.out.println(ans);
			return;
		}
		Toss(n-1,ans+"H");//head
		Toss(n-1,ans+"T");//Tail
	}

}
