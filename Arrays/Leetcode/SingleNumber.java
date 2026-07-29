//Leetcode 136
//Striver
class SingleNumber{
    public int singleNumber(int[] nums) {
        int ans=0;
        int n=nums.length;
        //int count=0;
        for(int i=0;i<n;i++){
           ans^=nums[i];
        }
        return ans;
    }
}