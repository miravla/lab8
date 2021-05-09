package Exercise3;

public class SuspendThreadDemo {
	public static void main(String[] args) {

		//create object
		Runnable selector1 = new SuspendThread();
		Runnable selector2 = new SuspendThread();
		Runnable selector3 = new SuspendThread();
		
		//create frame
		Thread thread1 = new Thread(selector1,"text");
		Thread thread2 = new Thread(selector2,"word1");
		Thread thread3 = new Thread(selector3,"suspendText");
	
		//execute
		thread3.start();
		thread2.start();
		thread1.start();
		
	}
}
