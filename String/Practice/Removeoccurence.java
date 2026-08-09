import java.util.*;
public class Removeoccurence{
    public static String removeOccurence(String s,String part){
	   //kab tak same 2 steps karenge
	   //jab tk part exist karta h s string me
	   while(s.contains(part)){
	   //search part inside s
	     int index=s.indexOf(part);
       //create a new string by merging the left and right part of doud substring inside s string
        s=s.substring(0,index)+s.substring(index+part.length());	   
	   }
	   return s;
	}
     

   public static void main(String[] args){
    String s="daabcbaabcbc";
	String part="abc";
	System.out.println(removeOccurence(s,part));
   }
}