public class BinarySearchRe{
  
  public static int solve(int[] arr,int target,int s,int e){
    //Base case
	if(s>e){
	  return -1;
	}
	//processing or binary search ka logic 
	int mid=s+(e-s)/2;
	if(arr[mid]==target){
		return mid; 
	}
	if(arr[mid]>target){
		e=mid-1;
	}
	else if(arr[mid]<target){
		s=mid+1;
	}
	//R.c
	return solve(arr,target,s,e);
  }
  public static int binarySearch(int[] arr,int target){
      int s=0;
	  int e=arr.length-1;
	  int ans=solve(arr,target,s,e);
	  return ans;
  }
  public static void main(String args[]){
    int arr[]={10,20,30,40,50,60,70,80};
	System.out.println(binarySearch(arr,80));
  }
}