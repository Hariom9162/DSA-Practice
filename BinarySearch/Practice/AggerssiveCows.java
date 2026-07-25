import java.util.*;
public class AggerssiveCows{
  public static boolean isValidAns(int[] stalls,int k,int minDistance){
     //brute force
	 int cowCount=1;
	 //first cow is placed at 0 index
	 int lastPosition=0;
	 for(int i=1;i<stalls.length;i++){
	    //current cow ko current postion pe tabhi place kr paunga
		//jab current and prev cos k beach ka distance >=minDistance ho
		if(stalls[i]-stalls[lastPosition]>=minDistance){
		  cowCount++;
		  //kyuki new cow place ho chuki h
		  //isk mtlb lastPosition ko update karna padega
		  lastPosition=i;
		  if(cowCount==k){
		    return true;
		  }
		}
	 }
	 return false;
  }

   public static int aggressiveCows(int[] stalls,int k){
      Arrays.sort(stalls);
	  int n=stalls.length;
	  int start=0;
      int end=stalls[n-1]-stalls[0];
	  int ans=-1;
	  while(start<=end){
	     int mid=start+(end-start)/2;
		 
		 if(isValidAns(stalls,k,mid)){
		    //Possible solution mil gaya
			//ans store
			//move to right
			ans=mid;
			start=mid+1;
		 }
		 else{
		   //mid k sath there is no possible arrangment to place
		   //cows
		   //move to left
		   end=mid-1;
		 }
	  }
	  return ans;
   }
 
   public static void main(String args[]){
       int stalls[]={1,2,8,4,9};
	   int k=3;
	   int ans=aggressiveCows(stalls,k);
	   System.out.println("ans:" +ans);
   }
}