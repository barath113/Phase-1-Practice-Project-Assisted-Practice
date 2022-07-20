import java.util.*;
public class Collections {
		

	  public static void main(String[] args) {
	  
	   System.out.println("ArrayList");
	   ArrayList<String> city=new ArrayList<String>();   
	        city.add("Pune");//
	        city.add("Chennai");        
	        System.out.println(city);  
	   
	        System.out.println("\n");
	        System.out.println("Vector");
	        Vector<Integer> vector = new Vector();
	        vector.addElement(30); 
	        vector.addElement(45); 
	        System.out.println(vector);
	   
	        System.out.println("\n");
	        System.out.println("LinkedList");
	        LinkedList<String> names=new LinkedList<String>();  
	        names.add("Ram");  
	        names.add("Max");         
	        Iterator<String> itr=names.iterator();  
	        while(itr.hasNext()){  
	         System.out.println(itr.next());  
	         
	         System.out.println("\n");
	         System.out.println("HashSet");
	         HashSet<Integer> set=new HashSet<Integer>();  
	         set.add(101);  
	         set.add(102);  
	         set.add(103);
	         set.add(104);
	         System.out.println(set);
	         
	         System.out.println("\n");
	         System.out.println("LinkedHashSet");
	         LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	         set2.add(15);  
	         set2.add(16);  
	         set2.add(17);
	         set2.add(18);        
	         System.out.println(set2);
	         } 
	        }  
}