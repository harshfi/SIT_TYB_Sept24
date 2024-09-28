package Lec_6;
import java.util.*;
public class KeyPad {
	static List<String> l;
   static String keypad[]= {"","","abc","def","ghi","jkl",
		                   "mno","pqrs","tuv","wxyz"};
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		l= new ArrayList<>();
      genrate("",0,"23");
      System.out.println(l);
	}
	public static void genrate(String ans,int idx,String digits) {
		if(ans.length()==digits.length()) {
		  l.add(ans);
			return;
		}
		
		int d= digits.charAt(idx)-'0';
		String s=keypad[d];
		for (int i = 0; i < s.length(); i++) {
			genrate(ans+s.charAt(i),idx+1,digits);
		}
	}

}
