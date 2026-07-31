import java.util.*;
public class EkoSpoj{
  public static boolean isValidAns(int trees[],int m,int maxHeight){
	  int n=trees.length;
	  int totalWoodCount=0;
	  for(int i=0;i<n;i++){
		  if(trees[i]>maxHeight){
			  int currentWoodCount=trees[i]-maxHeight;
			  totalWoodCount+=currentWoodCount;
		  }
	    }
		  if(totalWoodCount>=m){
			  return true;
		  }else{
			  return false;
		  }
  }

  public static int maxSawHeight(int trees[],int m){
       int n=trees.length;
	   int s=0;
	   int maxi=-1;
	  for(int i=0;i<n;i++){
		  if(trees[i]>maxi){
		    maxi=trees[i];
		  }
	  }
	  	  int ans=-1;
		  int e=maxi;
	  
	  while(s<=e){
		  int mid=s+(e-s)/2;
		  if(isValidAns(trees,m,mid)){
			  ans=mid;
			  s=mid+1;
		  }else {
			  e=mid-1;
		  }
		  
	    }
		return ans;
   }

   public static void main(String[]args){
      int trees[]={20,15,10,17};
	  //int m=7;
	  int ans=maxSawHeight(trees,7);
	  System.out.println(ans);
   }
}