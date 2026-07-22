class AllocMinPage{
    static boolean isValidAnswer(int arr[],int k,int maxPages){
       //check whether mid or maxPages is a valid solution or not 
       int studentCount=1;
       int pages=0;
       for(int i=0;i<arr.length;i++){
           if(pages+arr[i]<=maxPages){
           //iska mtlb current book can be assigned
           //as it is not out of limit
           pages=pages+arr[i];
       }else{
           //current student ko current book
           //cannot be assigned wala case
           studentCount++;
           if(studentCount>k || arr[i]>maxPages){
               return false;
           }
           else{
               //can asign to new student
               pages=0;
               pages=pages+arr[i];
           }
       }
       
     }
     
     return true;
        
    }
    
    
    
    
    public int findPages(int[] arr, int k) {
        // code here
        //to find valid answer,books cannot must be >=student present
        if(arr.length<k){
            return -1;
        }
        int n=arr.length;
        int s=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
        }
        int e=sum;
        
        int ans=-1;
       
       while(s<=e){
           int mid=s+(e-s)/2;
           
           if(isValidAnswer(arr,k,mid)){
               //true wala case
               ans=mid;
               e=mid-1;
               
               
           }else{
               s=mid+1;
               
           }
       }
       return ans;
          
    }
}