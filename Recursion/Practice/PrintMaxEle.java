public class PrintMaxEle{
  public static void printMaxEle(int arr[],int i,int maxi){
    //Base case
	if(i>=arr.length){
		System.out.println("Max Value" + maxi);
	  return ;
	}
	//self work
	if(maxi<arr[i]){
	  maxi=arr[i];
	}
	//Recursive call
	printMaxEle(arr,i+1,maxi);
  }
  public static void main(String[] args){
     int arr[]={10,20,30,40,50,60};
	 int maxi=Integer.MIN_VALUE;
	 printMaxEle(arr,0,maxi);
  }
}