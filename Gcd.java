import java.util.*;
class Gcd{
   public static void main(String []args){
	   // A/c to me but if first number is greater then this code is work only for gcd
        // Scanner sc=new Scanner(System.in);
		 //int num1=sc.nextInt();
		 //int num2=sc.nextInt();
		 //int num3=num2%num1;
		 //if(num1%num3==0){
		 //System.out.println(num3);
		 
		 // A/c pepcoding code gcd and lcm 
         Scanner sc=new Scanner(System.in);
         int n1=sc.nextInt();
         int n2=sc.nextInt();
                   
          int on1=n1;
		  int on2=n2;
		  while(n1 % n2 !=0){
			  int rem=n1%n2;
			  n1=n2;
			  n2=rem;
		  }
		  int gcd=n2;
		  int lcm=(on1*on2)/gcd;
		 
		 System.out.println("gcd of two Number " + gcd);
		 System.out.println("lcm of two Number" + lcm);
		 
		}
		
   }
   
   
