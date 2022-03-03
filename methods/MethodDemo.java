package methods;

public class MethodDemo {
	public int multipynumbers(int a,int b) {
		int r=a*b;
		return r;
	}

	public static void main(String[] args) {

		MethodDemo b=new MethodDemo();
		int ans= b.multipynumbers(12,2);
		System.out.println("Multipilcation is :"+ans);
		}


}
