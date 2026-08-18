public class CountElement{
  public static void findTarget(int arr[],int i,int target,int count){
	//base case
	 if(i>=arr.length){
	 System.out.println(count);
	  return ;
	 }
	 //processing
	 if(arr[i]==target){
	   count++;
	 }
	 //R.case
	 findTarget(arr,i+1,target,count);
  }

  public static void main(String [] args){
    int arr[]={10,20,10,40,10};
	int i=0;
	int target=10;
	int count=0;    
	findTarget(arr,i,target,count);
  }
}