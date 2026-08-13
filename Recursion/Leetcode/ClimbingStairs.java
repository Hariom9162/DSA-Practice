//leetcode 70
//lovebubber
//problem time limit exceed solve in dp lecture in future

class ClimbingStairs {
    public int climbStairs(int n) {
       if(n==1){
        return 1;
       }  
       if(n==2){
        return 2;
       }
       int ans=climbStairs(n-1)+climbStairs(n-2);
       return ans;
    }
}