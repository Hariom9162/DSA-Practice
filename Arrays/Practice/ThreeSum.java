import java.util.*;
public class ThreeSum{
   static int[] ThreeSum(int arr[],int target){
       int n=arr.length;
	   for(int i=0;i<n-2;i++){
	      for(int j=i+1;j<n-1;j++){
		      for(int k=j+1;k<n;k++){
		     if(arr[i]+arr[j]+arr[k]==target){
			    int ans[]={arr[i],arr[j],arr[k]};
				return ans;
			 }
			}
		  }
	   }
	   int ans[]={};
	   return ans;
   }
   
   
   
   
    
	public static void main(String args[]){
	   //int target=15;
	   int arr[]={2,1,3,5,4,6};
	    int ans[]=(ThreeSum((arr),15));
	   for(int a:ans){
		   System.out.println(a);
	   }
	
   }
}