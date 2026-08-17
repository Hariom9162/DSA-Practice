public class PrintArray{
  public static void printArray(int arr[],int i){
    //Base case
	if(i>=arr.length){
	  return ;
	}
	//self work
	System.out.println(arr[i]);
	//Recursive call
	printArray(arr,i+1);
  }
  public static void main(String[] args){
     int arr[]={10,20,30,40,50,60};
	 printArray(arr,0);
  }
}