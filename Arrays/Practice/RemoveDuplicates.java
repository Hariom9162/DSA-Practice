import java.util.*;
//Remove Duplicates from the sorted array
public class RemoveDuplicates{
     static int removeDuplicate(int nums[]){
	     int i=0;
		 int j=1;
		 int n=nums.length;
		 while(j<n){
		    if(nums[i] == nums[j]){
			    j++;
			}
			else{
			  //no match
			  i++;
			  nums[i]=nums[j];
			  j++;
			}
		 }
		 return i+1;
	}
    
	
	
	
	
	
	
     public static void main(String args[]){
	    int nums[]={1,2,2,2,2,3,3,5};
		System.out.println(removeDuplicate(nums));
	 }
}