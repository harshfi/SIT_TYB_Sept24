package Lec_5;

public class RatinMaza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       path(0,0,3,3,"");
	}
	public static void path(int cr,int cc,
			int dr,int dc,String ans) {
		
		if(cc==dc && cr==dr) {
			System.out.println(ans);
			return;
		}
		if(cr>dr || cc>dc) return;
		
		path(cr,cc+1,dr,dc,ans+"H");
		path(cr+1,cc,dr,dc,ans+"V");
		
	}

}
