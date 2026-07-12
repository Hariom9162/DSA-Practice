import java.util.*;
public class TransposeMatrix{
   public static int[][] transpose(int[][] arr){
      //if(arr == null || arr.null == 0){
	    //return new int[0][0];
	  //}
	  //for original array
	  int totalRows=arr.length;
	  int totalCols=arr[0].length;
	  
	  //for new array
	  int newTotalRows=totalCols;
	  int newTotalCols=totalRows;
	  int ans[][]=new int[newTotalRows][newTotalCols];
	  
	  //actual logic
	  for(int i=0;i<totalRows;i++){
	     for(int j=0;j<totalCols;j++){
		     ans[j][i]=arr[i][j];
		 }
	  }
	  return ans;
	  
	  
   }


   public static void main(String args[]){
      int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(arr)));
    } 
}