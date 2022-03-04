package assistedqueue;
import java.util.*;

public class QueueDemo {
	public static void main(String[] args) 
	{
	        		Queue<String> locationsQueue = new LinkedList<>();
	locationsQueue.add("pune");
	        		locationsQueue.add("chennai");
	        		locationsQueue.add("Delhi");
	        		locationsQueue.add("mumbai");
	        		locationsQueue.add("Noida");
	        		locationsQueue.add("punjab");
	System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}

}
	


