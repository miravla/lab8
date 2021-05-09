package Exercise1;


public class ThreadExtendDemo {

	public static void main(String[] args) {
		
		// Create objects of thread
		ThreadExtend Thread1 = new ThreadExtend();
		ThreadExtend Thread2 = new ThreadExtend();

		// Named the thread
		Thread1.setName("Thread 1");
		Thread2.setName("Thread 2");
		
		// Execute threads
		Thread1.start();
		Thread2.start();

	}

}