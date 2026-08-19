public class exception{
  public static void main(String[]args){
     System.out.println("Hariom");
	 try{
	 System.out.println(10/2);
	}catch(ArithmeticException e){
	   System.out.println("Exception Occure");
	}finally{
		System.out.println("finally Runs");
	}
	   System.out.println("Hariom singh");
}
}