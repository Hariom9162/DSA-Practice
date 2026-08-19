public class PrintNumber{
   public static void printNumber(int n,int count){
	 if(count>n){
	   return;
	 }
	 System.out.println(count);
	 printNumber(n,count+1);
   }
   
   public static void main(String[] args){
      printNumber(5,1);
   }
}