package org.Practice.Multithreading;

public class ThreadCreation {

	/*public void run()
	{
		System.out.println("in run");
	}*/
	
	public static class MyThread implements Runnable
	{
		public void run()
		{
			System.out.println("inside run");
			Thread tr = Thread.currentThread();
			System.out.println(tr.getName());
			System.out.println(tr.getId());
		}
	}

	public static void main(String[] args) {
		Thread myThread = new Thread(new MyThread(),"Thread1");
		myThread.start();
		
		System.out.println(myThread.getId());
	}
	
	/*//usinf anonymoius class
	Thread thread = new Thread()
	{
		public void run()
		{
			System.out.println("inside anonymouus run");
		}
	}
	*/
	
	
}
