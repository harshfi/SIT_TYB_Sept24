package Lec_2;
import java.util.*;
public class Two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner h = new Scanner (System.in);
         int n=h.nextInt();
         int arr[]= new int [n];
         
         for (int i = 0; i < arr.length; i++) {
			arr[i]=h.nextInt();
		}
         
         int target= h.nextInt();
         
         int idx[]= twosum(arr, target); // 2 4
         
         System.out.println(idx[0]+" "+idx[1]);
	}
	public static int [] twosum(int arr[],int target) {
		int ans[]= new int[2];
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]+arr[j]==target) {
					ans[0]=i;
					ans[1]=j;
					return ans;
				}
			}
		}
		return ans;
		
	}

}
