public class PowerOfTwo{
   public static int powerOftwo(int n){
     if(n==0){
	   return 1;
	 }
	 int ans=2*powerOftwo(n-1);
	 return ans;
   }
   public static void main(String []args){
    System.out.println(powerOftwo(5));
   }
}