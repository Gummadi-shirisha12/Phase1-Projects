package oops;

public class Polymorphism {
    public int sum(int a, int b) 
    { 
        return (a + b); 
    } 
    public int sum(int A, int B, int C) 
    { 
        return (A + B + C); 
    } 
    public double sum(double a, double b) 
    { 
        return (a + b); 
    } 
    public static void main(String args[]) 
    { 
      Polymorphism s = new Polymorphism(); 
        System.out.println(s.sum(20, 30)); 
        System.out.println(s.sum(10, 20, 30)); 
        System.out.println(s.sum(10.5, 20.5)); 
    } 


}
