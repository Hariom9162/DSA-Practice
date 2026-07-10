import java.util.*;
public class ArraysProb{
   static int[] TwoSum(int arr[],int target){
       int n=arr.length;
	   for(int i=0;i<n-1;i++){
	      for(int j=i+1;j<n;j++){
		     if(arr[i]+arr[j]==target){
			    int ans[]={arr[i],arr[j]};
				return ans;
			 }
		  }
	   }
	   int ans[]={};
	   return ans;
   }
   
   
   
   
    
	public static void main(String args[]){
	   //int target=10;
	   int arr[]={2,1,3,5,4,6};
	    int ans[]=(TwoSum((arr),10));
	   for(int a:ans){
		   System.out.println(a);
	   }
	
   }
}