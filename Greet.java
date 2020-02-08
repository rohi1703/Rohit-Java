package io.rohit;

public class Greet {

	public void greet(Greeting greeting)//now passing the behavior as an argument
	{
		//behavior is written inside the function not being passed an argument
		//System.out.print("Hello World!");	
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greet greet = new Greet();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		greet.greet(helloWorldGreeting);
		//helloWorldGreeting.perform();
		//greet.greet();
		
		Greeting lambdaGreeting = ()->System.out.print("Hello World");
		//lambdaGreeting.perform();
		greet.greet(lambdaGreeting);
	}

}

interface Lambda
{
	public void foo();
}
