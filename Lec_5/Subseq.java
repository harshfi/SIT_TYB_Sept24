package Lec_5;

public class Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sub("abc","",0);
	}
	
	public static void sub(String que,String ans,int i) {
		if(i==que.length()) {
			System.out.println(ans);
			return;
		}
		sub(que,ans+que.charAt(i),i+1);
		sub(que,ans,i+1);
	}
	

}
