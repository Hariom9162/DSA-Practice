public class OOPS{
     public static void main(String args[]){
	 Pen p1=new Pen();//created pen objects
	 p1.setColor("Red");
	 System.out.println(p1.color);
	 Animal a1=new Animal();
	 a1.setName("Dog");
	 System.out.println(a1.name);
	 Student s1=new Student();
	 s1.calcPercentage(50,30,20);
	 System.out.println(s1.percentage);
   }
}
   class Pen{
    String color;
	int tip;
	
	void setColor(String newColor){
	color=newColor;
	}
   void setTip(int newTip){
     tip=newTip;
	 }
	 }
	 class Animal{
	 String name;
	 int age;
	 void setName(String newName){
	 name=newName;
	 }
	 void age(int newAge){
	 age=newAge;
	 }
	 }
	 class Student{
	 String name;
	 int age;
	 float percentage;
	 void calcPercentage(int java,int cs,int os){
	 percentage=(java+cs+os)/3;
	 }
	 }

