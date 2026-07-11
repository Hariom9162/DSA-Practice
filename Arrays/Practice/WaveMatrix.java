import java.util.*;
public class WaveMatrix{
       public  static List<Integer> waveMatrix(int arr[][],int m,int n){
	      List <Integer> result=new ArrayList<>();
		  //lets move column wise
		  for(int col=0;col<n;col++){
		      //hr ek column index to check kro for even/odd
			  if(( col & 1)==1){
			      //odd
				  //Bottom to top
				  for(int row=m-1;row>=0;row--){
				    result.add(arr[row][col]);
				  }
				  
			  }
			  else{
			   //even
			   //top to bottom
			   for(int row=0;row<m;row++){
				   result.add(arr[row][col]);
			   }
			  } 
		    }
		  return result;
	   }


    public static void main(String args[]){
	     int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		 int m=4;
		 int n=4;
		 System.out.println(waveMatrix((arr),m,n));
	}
}