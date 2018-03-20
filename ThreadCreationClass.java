package org.Practice.Multithreading.ThreadSafety;

public class ThreadCreationClass implements Runnable {
	ThreadSafeAndNonSafeClassExample instance=null;
	public ThreadCreationClass(ThreadSafeAndNonSafeClassExample newObj)
	{
		this.instance = newObj;
	}
	@Override
	public void run() {
		System.out.println("working thread is "+Thread.currentThread());
		instance.add("Some text");
		
	}


	public static void main(String[] args) {
		/*ThreadSafeAndNonSafeClassExample sharedObj = new ThreadSafeAndNonSafeClassExample();
		Thread thread1 = new Thread(new ThreadCreationClass(sharedObj),"T1");
		thread1.start();
		Thread thread2 = new Thread(new ThreadCreationClass(sharedObj),"T2");
		thread2.start();*/
		
		Thread thread1 = new Thread(new ThreadCreationClass(new ThreadSafeAndNonSafeClassExample()),"T1");
		thread1.start();
		Thread thread2 = new Thread(new ThreadCreationClass(new ThreadSafeAndNonSafeClassExample()),"T2");
		thread2.start();
	}

	
}
