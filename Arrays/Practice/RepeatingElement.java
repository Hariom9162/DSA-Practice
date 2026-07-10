import java.util.*;
public class RepeatingElement{
    static int findFirstRepeatingElement(int arr[]){
	     HashMap<Integer,Integer> freq=new HashMap<>();
		 //freq store
		 for(int num:arr){
		   freq.put(num, freq.getOrDefault(num,0)+1);
		 }
		 for(int i:arr){
		 if(freq.get(i)>1){
		      return i;
		}
		                  
		}
		//agar koi bhi freq>1 nhi hai
		 return -1;
		 
	}




     public static void main(String args[]){
	   int arr[]={2,4,6,6,8,7,8};
	   System.out.println(findFirstRepeatingElement(arr));
	 }
}