import java.util.*;
class RowWithMaxOnes{
  static int getFirstOccurence(int[][] arr,int rowIndex){
  int totalRow=arr.length;
  int totalCol=arr[0].length;
  int target=1;
  int ans=-1;
  //handle case where their is no one inside the row 
    if(arr[rowIndex][totalCol-1] == 0){
	//there is no 1 inside this row
	return totalCol;
	}else{
	   //1 exist karta ho inside the row
	   int s=0;
	   int e=totalCol-1;
	   while(s<=e){
	     int mid=s+(e-s)/2;
		 if(arr[rowIndex][mid]==0){
		   //move right
		   s=mid+1;
		 }else{
		   //==1 wala  case
          ans=mid;
         //left move
          e=mid-1;		 
		 }
	   }
	}
	return ans;
  }
  public static int rowWithMaxones(int mat[][]){
   int totalRow=mat.length;
   int totalCol=mat[0].length;
   int maxi=-1;
   int maxOneWaliRowIndex=-1;
    //move to each row 
	//find the first row
	//find the f.o will calculate the count of 1ns
	//update the maxi variable or the index variable basis on that
	for(int row=0;row<totalRow;row++){
	  //for each row,find F.O
	  int firstOccIndex=getFirstOccurence(mat,row);
	  //calculate number of 1 s in this row
	  int oneCount=totalCol-firstOccIndex;
	  //update maxi or ans index variable basis on count
	  if(oneCount!=0 && oneCount>maxi){
	    //may be current row is the ans
		maxi=oneCount;
		maxOneWaliRowIndex=row;
	  }
	}
	return maxOneWaliRowIndex;
  }
  public static void main(String args[]){
       int mat[][]={{0,0,0,1},{0,0,1,1},{0,1,1,1},{1,1,1,1}};
	   System.out.println(rowWithMaxones(mat));
  }
}