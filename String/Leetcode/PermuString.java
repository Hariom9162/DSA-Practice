//leetcode 567
//lovebubber
class PermuString {
    static boolean compareFreq(int[]count1,int[]count2){
        for(int i=0;i<26;i++){
            if(count1[i]!=count2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
       //algo wise
       //basic check->whether s1 ke char present in s2 or not 
       //s1 ke table ready kar lete  
       //s2 ke first window ko process kar lete hai 
       //s2 ki remaining window ko process kar lete hai 

       if(s1.length()>s2.length()){
        return false;
       } 

       //s1 ka freq table 
       int[] count1=new int[26];
       for(int i=0;i<s1.length();i++){
         char ch=s1.charAt(i);
         int index=ch - 'a';
         count1[index]++;
       }
     
      int i=0;
      int windowLength=s1.length();
      int count2[]=new int[26];
      //first window ka freq table
      for(i=0;i<windowLength;i++){
          char ch=s2.charAt(i);
          int index=ch - 'a';
          count2[index]++;
      }
     if(compareFreq(count1,count2)==true){
        return true;
     }
     else{
        //both the freq table are not matching
        //process remaining window
        while(i<s2.length()){
            //new window per move kar rahe hai,toh new char ko freq table me add karte hai 
            char newChar=s2.charAt(i);
            int newCharIndex=newChar - 'a';
            count2[newCharIndex]++;
            //old char ke entry ko table se remove karo
            int oldCharIndex=i-windowLength;
            char oldChar=s2.charAt(oldCharIndex);
            int freqTableIndexOfOldChar=oldChar - 'a';
            count2[freqTableIndexOfOldChar]--;
            //ab updated table aa gaya hai new window ke liye
            //isko campare karo s1 ke reference table ke sath
            if(compareFreq(count1,count2)==true)
                 return true;
                 //yaha par main hamesha galti karta hu
                 i++;
        }
    }
     return false;
    }
}