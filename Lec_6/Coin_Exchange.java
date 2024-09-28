package Lec_6;
import java.util.*;
public class Coin_Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins[]= {2,3,5};
		find(8,coins,0,new ArrayList<>());

	}
	public static void find(int target, int coins[],
			int idx,List<Integer> ans) {
		if(target==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=idx;i<coins.length;i++) {
			
			if(coins[i]<=target) {
				ans.add(coins[i]);
				find(target-coins[i],coins,i,ans);
				ans.remove(ans.size()-1);
			}
		}
	}

}
