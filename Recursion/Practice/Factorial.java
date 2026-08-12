public class Factorial{
  public static int FactorialOfNo(int n){
     if(n==0){
	   return 1;
	 }
	 int ans=n*FactorialOfNo(n-1);
	 return ans;
  }
  public static void main(String args[]){
	  System.out.println(FactorialOfNo(4));
  }
}