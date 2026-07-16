import java.util.*;
public class UpperBound{
    public static int getUpperBound(int arr[],int target){
	   int n=arr.length;
	   int s=0;
	   int e=n-1;
	   int ans=-1;
	   
	   
	   while(s<=e){
	     int mid=s+(e-s)/2;
		 if(arr[mid]<=target){
		    //move to right
			s=mid+1;
		 }else{
		    //arr[mid]>target
			//ans store
			ans=mid;
			
			//move left
			e=mid-1;
		 }
	   }
	   return ans;
	}
	
	
	
	public static void main(String args[]){
	 int arr[]={10,20,30,30,30,30,40,50};
	  int target=25;
	  int ans=getUpperBound(arr,target);
	  System.out.println("ans:" + ans);
	}
}