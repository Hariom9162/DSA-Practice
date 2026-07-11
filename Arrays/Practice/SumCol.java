import java.util.*;
public class SumCol{
      static List<Integer> ColSum(int arr[][]){
	     List<Integer> result=new ArrayList<>();
		 int m=arr.length;
		 int n=arr[0].length;
		 for(int col=0;col<n;col++){
		    int sum=0;
			{
			  for(int row=0;row<m;row++){
			     int value=arr[row][col];
				 sum=sum+value;
			  }
			  result.add(sum);
			}
		 }
		 return result;
	  }


    public static void main(String args[]){
	    int arr[][]={{1,4,7},{2,5,8},{3,6,9}};
		System.out.println(ColSum(arr));
		
	}
}