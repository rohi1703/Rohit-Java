package io.rohit;

public interface Greeting {
	public void perform();
	public default void sayNamaste()
	{
		System.out.println("Hello and Namaste");
	}
}
