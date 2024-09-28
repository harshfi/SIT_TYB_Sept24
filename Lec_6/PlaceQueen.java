package Lec_6;

public class PlaceQueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int visited[]= new int [4];
      place(2, "",visited);
	}
	public static void place(int q,String ans,int visited[]) {
		if(q==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < visited.length; i++) {
			
			if(visited[i]!=1) {
				visited[i]=1;
				place(q-1,ans+"b"+i+"Q"+q+"  ",visited);
				visited[i]=0;
			}
		}
	}

}
