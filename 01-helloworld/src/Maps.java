import java.util.*;
public class Maps {	

  public static void main(String[] args) {
   
   HashMap<Integer,String> hm=new HashMap<Integer,String>();      
        hm.put(1,"Smith");    
        hm.put(2,"Ram");    
        hm.put(3,"Kumar");   
         
        System.out.println("\nThe elements of hashmap are ");  
        for(Map.Entry m:hm.entrySet()){    
         System.out.println(m.getKey()+" "+m.getValue());    
        }
        
       
         
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
        
        ht.put(4,"Ramya");  
        ht.put(5,"Lolita");  
        ht.put(6,"Parker");  
        ht.put(7,"Stark");  

        System.out.println("\nThe elements of HashTable are ");  
        for(Map.Entry n:ht.entrySet()){    
         System.out.println(n.getKey()+" "+n.getValue());    
        }
        
        
        
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
        map.put(8,"Tony");    
        map.put(9,"Arjun");    
        map.put(10,"Amrish");       
        
        System.out.println("\nThe elements of TreeMap are ");  
        for(Map.Entry l:map.entrySet()){    
         System.out.println(l.getKey()+" "+l.getValue());    
        }    
        
     }  
}