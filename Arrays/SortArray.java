import java.util.*;
public class SortArray{
    static int[] sortZerosandones(int arr[]){
	      int n=arr.length;
		  int i=0;
		  int j=n-1;
		  while(i<j){
		       if(arr[i]==1 && arr[j]==0){
				   //swap
				  arr[i]=0;
				  arr[j]=1;
			   }else if(arr[i]==0){
				   //i ko aage le jao
			      i++;
			   }else if(arr[j]==1){
				   //j ko pichhe le aao
			      j--;
			   }
		    }
		  return arr;
	}
	
	//Missing number in a array
	
	static int missingNumber(int arr[]){
		int xorSum=0;
		//xor sum with array element 
		for(int n:arr){
			xorSum=xorSum^n;
		}
		//xor sum with the array element range
		int n=arr.length;
		  for(int i=0;i<=n;i++){
			  xorSum=xorSum^i;
		  }
		//ans aa jayega
        return xorSum;		
		
	}
	
	//Find the Unique Element in an array
	   static int findUniqueElement(int arr[]){
		   int xorSum=0;
		   for(int n:arr){
			   xorSum=xorSum^n;
		   }
		   return xorSum;
		   
	   }
	


       public static void main(String args[]){
	   int arr[]={2,5,4,5,3,3,4};
	   System.out.println(findUniqueElement(arr));
		   
		   
		   //int arr[]={2,1,0,3,4};
		   //System.out.println(missingNumber(arr));
		  
		   
		
		//int arr[]={1,0,1,1,0,0,1};
		//System.out.println(Arrays.toString(sortZerosandones(arr)));//
		//sortZerosandones(arr);
		//for(int b:arr){//here no need this 
			//	System.out.println(b);
	    // }
	}
}