package collections;
import java.util.*;

public class AssistedCollection {
	public static void main(String[] args) {
	
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("pune");//
	      city.add("chennai");    	   
	      System.out.println(city);  
		
	
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(15); 
	      vec.addElement(30); 
	      System.out.println(vec);
		
	
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("virat");  
	      names.add("rahul");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	      
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(10);  
	       set.add(13);  
	       set.add(12);
	       set.add(14);
	       System.out.println(set);
	       
	     
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(1);  
	       set2.add(3);  
	       set2.add(2);
	       set2.add(4);	       
	       System.out.println(set2);
	      	} 
	      }  
	}

	


