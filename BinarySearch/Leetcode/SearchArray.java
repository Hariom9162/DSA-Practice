class SearchArray{
       public static int findPivotIndex(int nums[]){
      int n=nums.length;
	  int s=0;
	  int e=n-1;
	  int ans=-1;
	  if(nums[s]<nums[e]){
		  return -1;
	  }
	  //binary search vala logic
	  while(s<=e){
	    int mid=s+(e-s)/2;
		
		//eska matlab ham l2 vali line par 
		//ans to l1 vali line par vaha move kar jao
         if(nums[mid] <= nums[n-1]){
			 e=mid-1;
		 }else{
			 //mid mera l1 par already 
			 //ans store kr lo
			 ans=mid;
			 //move to right
			 s=mid+1;
		 }
		  
	  }
	  return ans;
   }
   public static int binarySearch(int nums[],int s,int e,int target){
       int n=nums.length;
		while(s<=e){
            int mid=s+(e-s)/2;
		   if(nums[mid]==target){
		      //target found
			  return mid;
		   }else if(target>nums[mid]){
		      s=mid+1;
		   }else{
		      //taget<arr[mid]
			    e=mid-1;
		   }
		   
		   //update mid
		   mid=s+(e-s)/2;//(start+end)/2;integer overflow
		}
		
		//agar aap yaha tk aagaye h,eska matlab ye h 
		//target not found
		return -1;
	}



    public int search(int[] nums, int target) {
        int pivotIndex=findPivotIndex(nums);
        int n=nums.length;

        //if pivoteIndex=-1,then array is already sorted
        if(pivotIndex == -1){
            int ans=binarySearch(nums,0,n-1,target);
            return ans;
        }else{
           //array is not sorted,array is rotated sorted
         
           //array can be devided into l1 and l2 
            //indexes for l1 wala array ka part
        int startArray1=0;
        int endArray1=pivotIndex;
        if(target>=nums[startArray1] && target <=nums[endArray1]){
            int ans=binarySearch(nums,startArray1,endArray1,target);
            return ans;
        }


        //indexes for l2 array kar part
        int startArray2=pivotIndex+1;
        int endArray2=n-1;
        if(target>=nums[startArray2] && target <=nums[endArray2]){
            int ans=binarySearch(nums,startArray2,endArray2,target);
            return ans;
        }
        }
       return -1;
    }
}