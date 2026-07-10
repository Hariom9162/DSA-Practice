import java.util.*;
public class PivotElement{

   static int pivotElement(int nums[]){
        int n=nums.length;
		int leftSum[]=new int[n];
		int rightSum[]=new int[n];
		
		//fill left Sum wala array
		leftSum[0]=nums[0];
		for(int i=1;i<n;i++){
		   leftSum[i]=leftSum[i-1] + nums[i];
		}
		
		//fill right Sum wala array
		rightSum[n-1]=nums[n-1];
		for(int i=n-2;i>=0;i--){
		   rightSum[i]=rightSum[i+1] + nums[i];
		}
		
		//Check for Equality
		
		for(int i=0;i<n;i++){
		  if(leftSum[i] == rightSum[i]){
		     return nums[i];
		  }
		}
		return -1;
   }

   public static void main(String args[]){
        int nums[]={1,7,3,6,5,6};
		System.out.println(pivotElement(nums));
   }
}