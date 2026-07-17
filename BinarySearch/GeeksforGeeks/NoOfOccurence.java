class NoOfOccurence{
     static int getLowerBound(int arr[],int target){
      int n=arr.length;
	  int s=0;
	  int e=n-1;
	  int ans=n;
	  
	  while(s<=e){
	     int mid=s+(e-s)/2;
		 if(arr[mid]>=target){
		    //ans store
			ans=mid;
			//move to left
			e=mid-1;
		 }else{
		   //right move
		   s=mid+1;
		 }
		 
	  }
	  return ans;
	  
   }
    
     static int getUpperBound(int arr[],int target){
	   int n=arr.length;
	   int s=0;
	   int e=n-1;
	   int ans=n;
	   
	   
	   while(s<=e){
	     int mid=s+(e-s)/2;
		 if(arr[mid]<=target){
		    //move to right
			s=mid+1;
		 }else{
		    //arr[mid]>target
			//ans store
			ans=mid;
			
			//move left
			e=mid-1;
		 }
	   }
	   return ans;
	}
    int countFreq(int[] arr, int target) {
        // code here
        int lbIndex=getLowerBound(arr,target);
        int ubIndex=getUpperBound(arr,target);
        int ans=ubIndex-lbIndex;
        return ans;
    }
}
