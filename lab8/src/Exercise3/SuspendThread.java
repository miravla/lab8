package Exercise3;


import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class SuspendThread implements Runnable {

	//set word to arrange
	private String randomArrange[] = { "it", "is", "recommended", "to", "use", "Calendar", "class" };
	
	
	private static boolean isRunning = false;

	//rearrange word in random number generated
	private void rearrangeSentence() {

		Random random = new Random();
		
		Set<Integer> set = new LinkedHashSet<Integer>();

		while (set.size() < randomArrange.length) {
			
			int randomNumber = random.nextInt(randomArrange.length);
			set.add(randomNumber);
		}

		Object newSequence[] = set.toArray();

		String newSentence = "";
		
		for (int counter = 0; counter < randomArrange.length; counter++) {
			newSentence += randomArrange[(int) newSequence[counter]] + " ";
			
			//indicate thread is executing
			isRunning = true;
		}
		System.out.println(newSentence);
	}

	//suspend thread
	public void rearrangeSentence(String threadName) {
		Random random = new Random();
		Set<Integer> set = new LinkedHashSet<Integer>();

		while (set.size() < randomArrange.length) {
			int randomNum = random.nextInt(randomArrange.length);
			set.add(randomNum);
		}

		Object newSequence[] = set.toArray();

		String newSentence = threadName + " : ";
		for (int j = 0; j < randomArrange.length; j++) {
			newSentence += randomArrange[(int) newSequence[j]] + " ";
			try {
				//display message if thread is suspending
				if (isRunning == true) {
					System.out.println("\n\n" + threadName + " is suspending for 5 seconds" + "\n\n");
					
					//set timer to 5 s
					Thread.sleep(5000);
					isRunning = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(newSentence);
	}


	//take out the word 1 by 1 in text
		private void extractString() {
			String text = "Nezuko Is super Cute";
			for(int j = 0; j < 20; j++) {
				String subText = text.substring(0, j + 1);
				System.out.println(subText);
			}
		}
		
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();
		if (threadName.equals("text")) {
			extractString();
		} else if (threadName.equals("word1")) {
			rearrangeSentence();
		} else if (threadName.equals("suspendText")) {
			rearrangeSentence(threadName);
		}
	}

}