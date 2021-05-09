package Exercise2;


public class MultiplyThreadDemo {

	public static void main(String[] args) {

		//create object
				Runnable selector1 = new MultiplyThread();
				Runnable selector2 = new MultiplyThread();
				
				//create frame
				Thread thread2 = new Thread(selector2,"word1");
				Thread thread1 = new Thread(selector1,"text");
			
				//execute
				thread1.start();
				thread2.start();

}
}