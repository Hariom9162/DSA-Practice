//1074 remove all adjacent duplicate in string
//love bubber
class AdjDupString {
    public String removeDuplicates(String s) {
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
        

        //comapre ans k rightmost char ko current char se
        if(ans.length()>0 && ans.charAt(ans.length()-1) == ch){
            ans.deleteCharAt(ans.length()-1);
        }else{
            //if these 2 are different char
            ans.append(ch);
        }
     }
     return ans.toString();
    }
}