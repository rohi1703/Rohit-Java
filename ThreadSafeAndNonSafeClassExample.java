package org.Practice.Multithreading.ThreadSafety;

public class ThreadSafeAndNonSafeClassExample {
	StringBuilder strbuilder = new StringBuilder();
	
	public void add(String str)
	{
		System.out.println("working thread in add method is "+Thread.currentThread());
		this.strbuilder.append(str);
		System.out.println(strbuilder.toString());
	}

}
