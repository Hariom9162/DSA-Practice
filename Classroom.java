import java.util.ArrayList;
//import java.util.*;
public class Classroom{
	public static void swap(ArrayList<Integer>list,int idx1,int idx2){
		int temp=list.get(idx1);
		list.set(idx1,list.get(idx2));
		list.set(idx2,temp);
	}
        public static void main(String []args){
                ArrayList<Integer> list=new ArrayList<>(); 
                ArrayList<String> list2=new ArrayList<>(); 
                ArrayList<Boolean> list3=new ArrayList<>();
                list.add(1);//0(1)
                list.add(2);
                list.add(3);
                list.add(4);
				int idx1=1,idx2=3;
				System.out.println(list);
				swap(list,idx1,idx2);
				System.out.println(list);
				/*int max=Integer.MIN_VALUE;//0(n)
				for(int i=0;i<list.size();i++){
					if(max<list.get(i)){
                 max=list.get(i);
					}
				}
              System.out.println("max element="	+max);	*/		
				//Reverse print-o(n)
				/*for(int i=list.size()-1;i>=0;i--){
					System.out.print(list.get(i)+" ");
				}*/
				/*System.out.println(list.size());//size methode
				//print the arraylist
				for(int i=0; i<list.size();i++){
					System.out.print(list.get(i)+ " ");
				}
				System.out.println();*/
				//list.add(1,9);//0(n)
                //System.out.println(list);
				//Get operation=0(1)
				//int element=list.get(1);
				//System.out.println(element);
				//Delete
				 //list.remove(2);
				 //System.out.println(list);
				 //set ELement at Index
				 //list.set(2,10);
				 //System.out.println(list);
				 //contains
				 //System.out.println(list.contains(1));
				 //System.out.println(list.contains(11));
        }
}