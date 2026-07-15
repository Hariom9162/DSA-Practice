import java.util.*;
public class SelectionSort{
   public static void selectionSort(int arr[]){
       //outer loop for rounds
	   int n=arr.length;
	   for(int i=0;i<n-1;i++){
	       int minIndex=i;
		   //inner loop->comparison arr[j] and arr[minIndex]
		   for(int j=i+1;j<n;j++){
		   if(arr[j]<arr[minIndex]){
		     minIndex=j;
		   }
		 }
		//when comparison are completed
        //toh main MinIndex wali value ko correct position pe place kar dunga
	    //swap arr[i],arr[minIndex]
		int temp=arr[i];
		arr[i]=arr[minIndex];
		arr[minIndex]=temp;
	   }
   }


  public static void main(String args[]){
      int arr[]={5,6,4,1,3};
	  selectionSort(arr);
	  System.out.println("Printing the array:");
	  for(int value:arr){
	    System.out.print(value+"" );
	  }
  }
}