//leetcode 268
//Striver 
class MissingNumber{
    public int missingNumber(int[] nums) {
        long n=nums.length;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        long expSum=n*(n+1)/2;
        return (int)(expSum-sum);
    }
}