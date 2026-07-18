import java.util.*;
public class PivotIndex{
   public static int findPivotIndex(int arr[]){
      int n=arr.length;
	  int s=0;
	  int e=n-1;
	  int ans=-1;
	  if(arr[s]<arr[e]){
		  return -1;
	  }
	  //binary search vala logic
	  while(s<=e){
	    int mid=s+(e-s)/2;
		
		//eska matlab ham l2 vali line par 
		//ans to l1 vali line par vaha move kar jao
         if(arr[mid] <= arr[n-1]){
			 e=mid-1;
		 }else{
			 //mid mera l1 par already 
			 //ans store kr lo
			 ans=mid;
			 //move to right
			 s=mid+1;
		 }
		  
	  }
	  return ans;
   }

  public static void main(String []args){
      int arr[]={3,4,5,1,2};
	  int ans=findPivotIndex(arr);
	  System.out.println("ans:" + ans);
  }
}