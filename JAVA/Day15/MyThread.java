package Day15.java;
import java.lang.*;

class MyThread extends Thread {
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Number:" +i);
		
		try
		{
			Thread.sleep(1000);
			}
		catch(InterruptedException e)
		{
			System.out.println(e);
			}
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t=new MyThread();
		t.start();
	}

}
