public class FindTarget{
  public static int findTarget(int arr[],int i,int target){
     //base case
	 if(i>=arr.length){
	  return -1;
	 }
	 //processing
	 if(arr[i]==target){
	    return i;
	 }
	 //R.case
	 int ans=findTarget(arr,i+1,target);
	 return ans;
  }

  public static void main(String [] args){
    int arr[]={10,20,30,40,50};
	int i=0;
	int target=40;
	int ans=findTarget(arr,i,target);
	System.out.println("Found index at:"+ans);
  }
}