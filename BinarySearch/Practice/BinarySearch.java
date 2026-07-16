import java.util.*;
public class BinarySearch{
    public static int binarySearch(int arr[],int target){
	    int n=arr.length;
		int start=0;
		int end=n-1;
		int mid=start+(end-start)/2;//(start+end)/2; does not use beacause of integer overflow
		while(start<=end){
		   if(arr[mid]==target){
		      //target found
			  return mid;
		   }else if(target>arr[mid]){
		      start=mid+1;
		   }else{
		      //taget<arr[mid]
			    end=mid-1;
		   }
		   
		   //update mid
		   mid=start+(end-start)/2//(start+end)/2;integer overflow
		}
		
		//agar aap yaha tk aagaye h,eska matlab ye h 
		//target not found
		return -1;
	}
	
	public static void main(String args[]){
	   int arr[]={10,20,30,40,50,60,70,80};
	   int target=80;
	    System.out.println(binarySearch((arr),target));
	}
	
}