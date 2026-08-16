public class PrintMinEle{
  public static void printMinEle(int arr[],int i,int mini){
    //Base case
	if(i>=arr.length){
		System.out.println("Min Value" + mini);
	  return ;
	}
	//self work
	if(mini>arr[i]){
	  mini=arr[i];
	}
	//Recursive call
	printMinEle(arr,i+1,mini);
  }
  public static void main(String[] args){
     int arr[]={10,20,30,40,50,60};
	 int mini=Integer.MAX_VALUE;
	 printMinEle(arr,0,mini);
  }
}