import java.util.*;
class RotNub{
    public static void main(String []args){
	   Scanner sc=new Scanner(System.in);
	   //if input and Number of rotation given in Program
	   //int n=sc.nextInt();
	   //int a=n/100;
	   //int b=n%100;
	   //int c=b*1000;
	   //System.out.println(c+a);
	   
	   // if user input in program 
	   int n=sc.nextInt();
	   int k=sc.nextInt();
	   //count the digit
	   int temp=n;
	   int nod=0;
	   while(temp>0){
		   temp=temp/10;
		   nod++;
	   }
	   //Big number of rotation for given n
	    k=k%nod;
		//negative numbers of rotation for given n
		if(k<0){
			k=k+nod;
			
		}
	   
	   //logic for find out the div and mult for given input number
	   int div=1;
	   int mult=1;
	   for(int i=1;i<=nod;i++){
		   if(i<=k){
			   div=div*10;
		   }else{
			   mult=mult*10;
		   }
		   
	   }
	   //logic for rotation
	   int q=n/div;
	   int r=n%div;
	   int rot=r*mult+q;
	   System.out.println(rot);
	   
	   
	}
 }