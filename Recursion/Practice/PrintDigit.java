public class PrintDigit{
 public static void printDigit(int n){
  //Base case
  if(n==0){
  return ;
  }
  //Processing
  int digit=n%10;
  n=n/10;
  
  //R.case
  printDigit(n);
   System.out.println(digit);

 } 
 public static void main(String args[]){
   printDigit(137);
 }
}