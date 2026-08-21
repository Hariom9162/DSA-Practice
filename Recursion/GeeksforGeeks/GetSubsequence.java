import java.util.*;
class  GetSubsequence{
        // Code here
        static void getAllSubsequences(String s,int index,StringBuilder output,List<String> ans){
            //base case
            if(index>=s.length()){
                //subsequence ready hai
                String subsequence=output.toString();
                ans.add(subsequence);
                return;
                
            }
            
            //1 case hum solve karenge baki sab recursion sambhal lega
            
            //include exclude pattern 
            char ch=s.charAt(index);
            
            //include
            output.append(ch);
            getAllSubsequences(s,index+1,output,ans);
            
            //exclude
            output.deleteCharAt(output.length()-1);
            getAllSubsequences(s,index+1,output,ans);
        }
 public List<String> powerSet(String s) {
        List <String> ans=new ArrayList<>();
        StringBuilder output=new StringBuilder();
        int index=0;
        
        getAllSubsequences(s,index,output,ans);
        Collections.sort(ans);
        return ans;
    }
}