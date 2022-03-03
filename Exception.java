package assistedexception;

public class Exception {
    public static void main(String args[]) 
    {
        int[] array = new int[4];
        try 
        {
            array[5] = 4;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("array index out of bound"); 
        }
        finally 
        {
            System.out.println(" array size is " + array.length);
        }
    }


}
