package Day15.java;
import java.lang.*;

class MyRunnable implements Runnable {
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello from Thread");
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
	}

}

