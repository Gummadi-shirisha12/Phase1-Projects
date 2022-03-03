package innerclassesassisted;

public class InnerclsAssisted1 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		InnerclsAssisted1  ob=new 	InnerclsAssisted1 ();  
		ob.display();  
		}
	}


	//anonymous inner class
	abstract class AnonymousInnerClass {
		   public abstract void display();
		}



