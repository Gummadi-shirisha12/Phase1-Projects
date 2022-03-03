package threadassisted.com;

public class ThreadDemo extends Thread {
	public void run()
 	{
  		System.out.println("Thread in java..");
}
 	public static void main( String args[] )
 	{
  	ThreadDemo t = new  ThreadDemo();
  		t.start();
 	}
}

	


