import java.util.*;
public class MaxSubArray{
     static int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
          //step1:create sum
           sum=sum+nums[i];
          //step2:maxi update
          maxi=Math.max(maxi,sum);
          //step3:sum check for neagative value
           if(sum<0)
            sum=0;
           
        }
        return maxi;
    }
	public static void main(String []args){
	   int nums[]={-2,1,-3,4,-1,2,1,-5,4};
	   System.out.println(maxSubArray(nums));
	}
}