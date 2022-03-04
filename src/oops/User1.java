package oops;

public class User1 {
	public static void main (String[] args)  
    { 
        Encap obj = new Encap(); 
        obj.setName("siri"); 
        obj.setAge(21); 
        obj.setRoll(10); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
    } 


}
