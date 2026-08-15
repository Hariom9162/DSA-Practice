public class PrintName{
  public static void printName(int n){
     if(n==0){
	   return;
	 }
	 System.out.println("Hariom");
	 printName(n-1);
  }

  public static void main(String[] args){
    printName(10);
  }
}