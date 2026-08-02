public class SingleNonDuplEle{
   public static int SingleNonDuplicate(int arr[]){
      int n=arr.length;
	  int s=0;
	  int e=n-1;
	  
	  while(s<=e){
		int mid=s+(e-s)/2;
		//single element
		if(s==e){
			return arr[s];
		}
		//non single element array
		//check whether mid element is ans or not
		int currentValue=arr[mid];
		
		int prevValue=-1;
		if(mid-1>=0){
			prevValue=arr[mid-1];
		}
		int nextValue=-1;
		if(mid+1<n){
			nextValue=arr[mid+1];
		}
		if(currentValue !=prevValue && currentValue!=nextValue){
			return currentValue;
		}
		if(currentValue !=prevValue && currentValue==nextValue){
			int StartingIndexpair=mid;
			
			if((StartingIndexpair & 1)==1){
				//starting index is odd
			//move to left 
				e=mid-1;
			}else{
				//starting index is even
				//move right 
				s=mid+1;
			}
			
		}else if(currentValue==prevValue && currentValue!=nextValue){
			int endingIndexpair=mid;
			if((endingIndexpair & 1)==1){
				//ending index is odd
				// move to right
				s=mid+1;
			}else{
				//endingindex is even 
				e=mid-1;
			}
		}
	  }
	  return -1;
   }

   public static void main(String args[]){
     int arr[]={10,10,20,30,30,40,40,50,50,60,60};
	 System.out.println(SingleNonDuplicate(arr));
   }
}