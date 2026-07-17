import java.util.*;
public class MountainArray{
   public static int peakIndexInMountainArray(int[] arr){
        int n=arr.length;
		int s=0;
		int e=n-1;
		int ans=-1;
		while(s<=e){
           int mid=s+(e-s)/2;
		   if(arr[mid]<arr[mid+1]){
		    //main ascending order vale part me hu 
			//eska matllab main left part me hu
			//or ans right me hai toh right me move kar jao 
			
		   
		      s=mid+1;
		   }else{
		         //arr[mid]>=arr[mid+1]
				 //eska matlab main right me hu
				 //eska matlab main potential solution pe hu
				 
		   
		       ans=mid;
			   //now find final solution
			   //mujhe pta hai right part decending order hai 
			   //toh bada no exist kart hai toh pakka left me milega
			   //left me move karo
			   e=mid-1;
			   
		   }
		}
		return ans;
		
   }



   public static void main(String args[]){
         int arr[]={10,20,30,40,50,60,70,35,25};
		 int ans=peakIndexInMountainArray(arr);
		 System.out.println("ans:" + ans);
   }
}