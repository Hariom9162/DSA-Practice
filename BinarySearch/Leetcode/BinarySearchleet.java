//leetcode 704
//striver
class BinarySearchleet{
    public int search(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        int ans=-1;
        if(nums[start]>nums[end]){
           return -1;
       }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                ans=mid;
                start=mid+1;
            }
        }
                    return ans;
//return -1;
    }
}