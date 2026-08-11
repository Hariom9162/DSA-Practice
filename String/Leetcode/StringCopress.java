//leetcode 443
//love bubber
class StringCopress {
    public int compress(char[] chars) {
       

       int readIndex=0;
       int writeIndex=0;

     while(readIndex<chars.length){
     char currentChar=chars[readIndex];
     int count=0;
       while(readIndex<chars.length && currentChar == chars[readIndex]){
        readIndex++;
        count++;
       }
      //ab mera pass current char and uska count dono available hai
      chars[writeIndex]=currentChar;
      writeIndex++;
      //now insert the count
      if(count>1){
        String countStr=String.valueOf(count);
        for(char digit: countStr.toCharArray()){
            chars[writeIndex]=digit;
            writeIndex++;
        }
      }
    }
    //return the length of compressed string
     return writeIndex;
 } 
}