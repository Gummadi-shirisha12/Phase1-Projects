package innerclassesassisted;

public class InnerclsAssisted {
	private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		InnerclsAssisted obj=new InnerclsAssisted();
		InnerclsAssisted.Inner in=obj.new Inner();  
		in.hello();  
	}
}



