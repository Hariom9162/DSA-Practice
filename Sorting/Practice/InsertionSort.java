import java.util.*;
public class InsertionSort{
   public static void insertionSort(int arr[]){
      int n=arr.length;
	  for(int i=1;i<n;i++){
	    int curr=i;
		int prev=i-1;
		int currValue=arr[i];
		while(prev>=0 && currValue<arr[prev]){
		   arr[prev+1]=arr[prev];
		   prev--;
		}
		//ab hamare pass ek khali jagah aa chuki hai 
		arr[prev+1]=currValue;
	  }
   }

   public static void main(String args[]){
      int arr[]={4,1,5,2,3};
	  insertionSort(arr);
	  for(int value:arr){
	    System.out.print(value+"" );
	  }
   }
}