public class studyMaterial{
  public static void main(String[]args){
   Copy c1=new Copy();
   c1.setName("Hindi");
   System.out.println(c1.name);
   c1.setPage(20);
   System.out.println(c1.page);
   BankAccount myAcc=new BankAccount();
   myAcc.setPassword("Hariom");
   System.out.println(myAcc.password);  
   }
}
  class Copy{
         String name;
		 int page;
		 
		 void setName(String newName){
		 name=newName;
		 }
		 void setPage(int newPage){
		 page=newPage;
		 
		}
    }	
 class BankAccount{
	  public String username;
	  String password;//you can't access password
	  public void setPassword(String pwd){
      password=pwd;
      }
    }
	class Phone{
		String name;
		int tip;
		
		String getName(){
			return this.name;
		}
		int getTip(){
			return this.tip;
		}
		void setName(String newName){
			this.name=newName;
		}
		void setTip(int Tip){
			this.tip=tip;
		}
	}