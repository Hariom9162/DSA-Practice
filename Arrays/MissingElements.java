import java.util.*;
public class MissingElements{
     public static List<Integer> findDisappearNumbers(int[] nums){
	    List<Integer> ans=new ArrayList<>();
	    //Marking
		int n=nums.length;
		for(int index=0;index<n;index++){
		    int value=Math.abs(nums[index]);
			int position =value-1;
			//mark kardo ye position
			if(nums[position]>0){
			   nums[position]=-nums[position];
			}
		}
		
		//travel array and whenever you encounter a positive value,print the number
		for(int i=0;i<n;i++){
		  if(nums[i]>0){
		  int valueAtThisIndex=i+1;
		     ans.add(valueAtThisIndex);
		  }
		}
		return ans;
	 }
    
    public static void main(String args[]){
	    int nums[]={1,4,4,5,2,2};
		System.out.println(findDisappearNumbers(nums));
	}
  
}