import java.util.*;
public  class ArrayManiprob{
       //revverse an array
	      static void getReverse(int arr[]){
		       int n=arr.length;
			   int i=0;
			   int j=n-1;
			   while(i<=j){
			      int temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
				  i++;
				  j--;
			   }
			   for(int k:arr){
				   System.out.println(k);
			   }
		    }
			
			//shift array element by one 
			static void shitElement(int arr[]){
				//step 1 store last element in temp variable  
				int n=arr.length;
				int temp=arr[n-1];
				// step 2 using loop shift all element in array
				for(int i=n-1;i>0;i--){
					arr[i]=arr[i-1];
				}
				//step 3 copy temp on zero index
				 arr[0]=temp;
				
			}
			
			//print extream element in an alternate manner
			static void printElement(int arr[]){
				int n=arr.length;
				int i=0;
				int j=n-1;
				while(i<=j){
					if(i==j){
						System.out.println(arr[i]);
						return;
					}else{
						//i<j
						System.out.println(arr[i]);
						i++;
						
						System.out.println(arr[j]);
						j--;
					}
				}
				
			}
          static int getMode(int arr[]){
      	  HashMap<Integer, Integer> freq=new HashMap<>();
		  for(int num:arr){
			  freq.put(num,freq.getOrDefault(num,0)+1);
			  
		  }
		  //for(int i:freq.keySet()){
			//  System.out.println(i+"->"+freq.get(i));
			  
		  //}
		  int maxFreq=-1;
		  int maxFreqWaliKey=-1;
		  
		  for(int key:freq.keySet()){
			int currentKey=key;
            int currentKeyKiFrequency=freq.get(key);
            if(currentKeyKiFrequency>maxFreq){
				//mujhe naya max mil gaya
				maxFreq=currentKeyKiFrequency;
				maxFreqWaliKey=currentKey;
			}			
			  
		  }
		  return maxFreqWaliKey;
	
}
   //identify Highest and Lowest frequency
       static int[] getHighestLowestFreqElement(int arr[]){
		   HashMap<Integer, Integer> freq=new HashMap<>();
		   //insert data
		   for(int num:arr){
			   freq.put(num, freq.getOrDefault(num,0)+1);
		   }
		   //hashmap is ready
		   int highestFreq=Integer.MIN_VALUE;
		   int highestNum=-1;
		   for(int key:freq.keySet()){
			   int currentKey=key;
			   int currentFreq=freq.get(key);
			   if(currentFreq>highestFreq){
				   //highest ko update krna chahiye
				   highestFreq=currentFreq;
				   highestNum=currentKey;
				   
			   }
			   
		   }
		   int lowestFreq=Integer.MAX_VALUE;
		   int lowestNum=-1;
		   for(int key:freq.keySet()){
			   int currentKey=key;
			   int currentFreq=freq.get(key);
			   if(currentFreq<lowestFreq){
				   //its time to update
				   lowestFreq=currentFreq;
				   lowestNum=currentKey;
			   }
		   }
		   int ans[]={highestNum,lowestNum};
		   return ans; 
		   
	   }
    

          public static void main(String args[]){
		       int arr[]={1,2,2,3,3,4,4,4,5,5,5,5};
			   int ans[]=getHighestLowestFreqElement(arr);
			   System.out.println("highest freq wala num " + ans[0]);
			   System.out.println("lowest freq wala num " + ans[1]);

			   //int arr[]={1,2,2,3,3,4,4,4,5,5,5,5};
               //int ans=getMode(arr);
			   //System.out.println(ans);
			  //int arr[]={1,2,3,4,5};
	
			  //printElement(arr);
			  //for(int b:arr){here no need this 
				//  System.out.println(b);
			  //}
			  
			  //int arr[]={1,2,3,4,5,6};
			  //shitElement(arr);
			  //for(int a:arr){
				//  System.out.println(a + " ");
			  //}
			  //System.out.println();
			  //int arr[]={2,4,6,8,9};
			  //getReverse(arr);
		  }
}