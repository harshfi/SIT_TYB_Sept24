package Lec_6;
import java.util.*;
public class GenrateParenthiese {
    static List<String> l;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 l= new ArrayList<>();
      genrate(3,0,0,"");
      System.out.println(l);
	}
	public static void genrate(int n ,int open,
			int close,String ans) {
		
		if(open==n && close==n) {
			l.add(ans);
			return;
		}
		if(open<n ) {
			genrate(n,open+1,close,ans+"(");
		}
		if(close<open) {
			genrate(n,open,close+1,ans+")");
		}
	}

}
