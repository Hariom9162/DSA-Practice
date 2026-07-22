import java.util.*;
public class PaintersPart{
    static boolean isValidSolution(int boards[],int k,int maxLength){
	  //mid-> max length of board(s),a painter can painter
	  //>than that is not allowed
	  //mid->maxLength
	  int painterCount=1;
	  int paintedLength=0;
	  for(int i=0;i<boards.length;i++){
	     if(paintedLength+boards[i]<=maxLength){
		   //assign that board to painter
		   paintedLength=paintedLength+boards[i];
		 }
		 else{
		     painterCount++;
			 paintedLength=0;
			 if(painterCount>k || boards[i]>maxLength){
			    return false;
			 }
			 else{
			 
			    paintedLength=paintedLength+boards[i];
			 }
		 }
	  }
	  return true;
	}

     public static int minTime(int[] boards,int k){
	    int sum=0;
		for(int i=0;i<boards.length;i++){
		   sum+=boards[i];
		}
		int ans=-1;
		int s=0;
		int e=sum;
		
		while(s<=e){
		    int mid=s+(e-s)/2;
			
			if(isValidSolution(boards,k,mid)){
			    ans=mid;
				e=mid-1;
			}
			else{
			  //not valid
			  s=mid+1;
			}
			
		}
		return ans;
	 }

    public static void main(String args[]){
	   int arr[]={5,10,30,20,15};
	   int k=3;
	   System.out.println(minTime(arr,k));
	   
	}
}
