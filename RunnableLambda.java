package io.rohit;

public class RunnableLambda {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside Runnable");
				
			}
			
			
		});
		
		thread.run();
		
		Thread runnableLambda = new Thread(()->System.out.print("Inside Runnable Lambda"));
		runnableLambda.run();

	}

}
