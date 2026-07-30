//codingNinja
//Striver
public class LongestSubArray{
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int left=0;
        int right=0;
        int n=a.length;
        int sum=a[0];
        int maxLength=0;
        while(right<n){
            while(left<=right && sum>k){
                sum-=a[left];
                left++;
            }
            if(sum==k){
                maxLength=Math.max(maxLength,right-left+1);
            }
            right++;
            if(right<n)sum+=a[right];
        }
        return maxLength;
    }
}