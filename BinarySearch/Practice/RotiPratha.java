import java.util.*;
public class RotiPratha{
	static boolean isValidans(int totalParatha,int[] cooks,int totalCooks,int timeLimit){
		int parathaCount=0;
		//ek ek karke har cook k pass jayenge 
		for(int i=0;i<cooks.length;i++){
			int currentCookRank=cooks[i];
			int timeTaken=0;
			int j=1;
			
			//currentCookRank->R 
			//1*R,2*R,3*R,4*R ......
			
			//cook karna start karo
			while(timeTaken <= timeLimit){
				if(timeTaken +j*currentCookRank<=timeLimit){
					//iska mtlb main ye paratha bana sakta hu
					timeTaken=timeTaken+j*currentCookRank;
					parathaCount++;
					j++;
				}
				else{
					//eska matlb current paratha timeLimit k andar nhi ban sakta
					break;
				}
			}
			// jab ye loop khtm hota hai,toh ye ith cook jitne parathe bana sakta tha,
				//unko ParathaCount me add kr chuka hota h
				if(parathaCount>=totalParatha){
					return true;
				}
		}
		if(parathaCount>=totalParatha){
			return true;
		}else {
			return false;
		}
	}
	
    public static int minTimeTOCookPratha(int p,int[] cook,int n){
	   //p-> number of paratha to cook
	   //n ->number of cooks
	   
	   int maxRank=-1;
	   for(int i=0;i<cook.length;i++){
		   if(cook[i]>maxRank){
			   maxRank=cook[i];
		   }
	   }
	   int s=0;
	   //e find 
	   int e=maxRank*(p*(p+1)/2);
	   int ans=-1;
	   while(s<=e){
		   int mid=s+(e-s)/2;
		   if(isValidans(p,cook,n,mid)){
			   //ans store
			   ans=mid;
			   //move left
			   e=mid-1;
		   }else{
			   //move right
			   s=mid+1;
		   }
	   }
	   return ans;
	
	}

   public static void main(String args[]){
        int cook[]={1,2,3,4};
		int ans=minTimeTOCookPratha(10,cook,4);
		System.out.println(ans);
   }
}