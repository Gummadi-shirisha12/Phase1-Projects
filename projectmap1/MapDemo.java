package projectmap1;
import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"keerthu");    
	      hm.put(2,"akshu");    
	      hm.put(3,"anju");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()) {    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }

	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"keerthu");  
	      ht.put(5,"akshu");  
	      ht.put(6,"basha");  
	      ht.put(7,"anju");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"shyam");    
	      map.put(9,"rosy");    
	      map.put(10,"siri");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}




