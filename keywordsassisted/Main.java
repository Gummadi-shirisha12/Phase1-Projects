package keywordsassisted;

public class Main {
	public static void main(String args[]) 
    { 
        try
        { 
            throw new ExceptionDemo("temp"); 
        } 
        catch (ExceptionDemo ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 



}
