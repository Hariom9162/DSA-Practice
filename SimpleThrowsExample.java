public class SimpleThrowsExample{
   public static void main(String[]args){
      int a=10;
	  try{
	  divide(a);
    }
	 catch(ArithemeticException e){
	 System.out.println(Arithmetic Exception occure"+e.getMessage());
	}
	}
	 static int divide(int a)throws ArithmeticException{
	 return a/0;
	 }
	}