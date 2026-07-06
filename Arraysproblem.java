public class ArraysProblem{
       
	   //find Average of array element 
	   static double getAverage(int[] arr){
	        // For sum calculate
			double sum=0;
			for(int i:arr){
			     sum+=i;
			}
			//For size calculate
			int size=arr.length;
			//For avg calculate
			double avg=sum/size;
			return avg;
	   }
	   //Multiply Each Element of array by 10
	   
	   static int[] multiPlyBy10(int[] arr){  
		  int size=arr.length;
		  //create array step 1
		   int newArray[]=new int[size];
		   //travrse on array 
		   for(int i=0;i<size;i++){
	               //input in array
			   int element=arr[i];
			   //multiply element by 10
			   int newElement=element*10;
			   //store in new array
			   newArray[i]=newElement;
			   
		   }
		   return newArray;
	   }
	   
	   //find element in array
	   
	   static boolean findTarget(int arr[],int target){
		   for(int i=0;i<arr.length;i++){
			   if(arr[i]==target){
				   return true;
			   }
		   }
		   //agar poora travel ho chuka hai
		   //and ek bhi baar  target nhi mila
		   //iska matlab,target is not in array
		   //return false
		   return false;
		   
	   }
	   
	   //Get maximum element in array
	   static int getMaximum(int arr[]){
		   int maxi=arr[0];
		   for(int i=0;i<arr.length;i++){
			   if(arr[i]>maxi){
				   maxi=arr[i];
			   }
			   
		   }
		   // after traversal jo sabse bada value ho return kar do
		   return maxi;
		   
	   }
	   
	   //return sum of +ve and -ve no in array
	   static int[] getSum(int arr[]){
		   int a=0;
		   int b=0;
		   for(int i=0;i<arr.length;i++){
			   if(arr[i]<0){
				   a+=arr[i];
				   
			   } else{
			        b+=arr[i]; 
			   }
		   }
		   int ans[]={a,b};
		   return ans;
	    }
	    
	  //Count zero and ones
	  
	  static int[] getZerone(int arr[]){
		  int a=0;
		  int b=0;
		  for(int i=0;i<arr.length;i++){
			  if(arr[i]==0){
				  a+=1;
			  }else{
				  b+=1;
			  }
		  }
		  int ans[]={a,b};
	      return ans;
	  }
	  
	  //get Unsorted Element
	  
	  static int getUnsortElement(int arr[]){
		  for(int i=0;i<arr.length;i++){
			  if(arr[i]>=arr[i+1]){
				  return arr[i+1];
			  }
			  
		  }
		  return -1;
		  
	  }
	  
	  //HomeWork
	  static int[] getSwaped(int arr[]){//learning?
        for(int i=0;i<arr.length-1;i+=2)//learning?
		  {
			  int ans=arr[i+1];
			  arr[i+1]=arr[i];
			  arr[i]=ans;
			   
	  }
	  return arr;//learning?
	  }
	  
	  
	  
	  public static void main(String []args){
		   
		   int arr[]={1,2,3,4,5,6};
		   int anr[]=(getSwaped(arr));
           for (int x : anr) {
        System.out.print(x + " ");//learning?
    }
		   
		   //int arr[]={1,2,3,5,8,6,9};
		   //System.out.println(getUnsortElement(arr));
		   
		   
		   
		   //int arr[]={1,0,1,1,0,1,1,1};
		   //int ans[]=getZerone(arr);
		   //System.out.println("Count of zeros = " + ans[0]);
		   //System.out.println("Count of ones = " + ans[1]);
		   
		   
		   //int arr[]={1,-2,-3,-4,5};
		   //int ans[]=getSum(arr);
		   //System.out.println("Positive Sum = " + ans[0]);
		   //System.out.println("Negative sum = " + ans[1]);
		   
		    
	  }
		  
		  //int arr[]={1,3,5,7,9};
		 // boolean ans=findTarget(arr,90);
		  //System.out.println(ans);
		    //int[] arr={1,2,3,4,5};
			//int[] ans=multiPlyBy10(arr);
			//System.out.println("printing ans array:");
			//for(int i:ans){
            //System.out.println(i);
				
		}
			
		  
	       //int[] arr={5,2,6,4};
		   //System.out.println(getAverage(arr));
    
  