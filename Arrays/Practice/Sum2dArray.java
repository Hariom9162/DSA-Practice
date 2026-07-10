import java.util.*;
public class Sum2dArray{
    static List<Integer> rowSum(int arr[][]){
	     List<Integer> result=new ArrayList<>();
		 int m=arr.length;
		 int n=arr[0].length;
		 for(int row=0;row<m;row++){
		   //whenever i come in new row then i make sum=o
		   int sum=0;
		     for(int col=0;col<n;col++){
			    int value=arr[row][col];
				sum=sum+value;
			 }
			 //when we had travled through all values of column
		     //and added all values then in the sum variable 
			 // we have sum of entire row
			 result.add(sum);
		 }
		 
	     return result;
	}


     public static void main(String args[]){
	    int arr[][]={{1,2,3},{4,5,6}};
		System.out.println(rowSum(arr));
		
	 }
}