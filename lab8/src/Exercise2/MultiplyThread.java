package Exercise2;


import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class MultiplyThread implements Runnable{

	
	/**
	 * This method rearrange sequence of sentence
	 * Thread: word1
	 */
	private void rearrangeSentence() {
		Random random = new Random();
		String randomArrange[]={ "it","is","recommended","to","use","Calendar","class"};
		Set<Integer>set = new LinkedHashSet<Integer>();
		
		while(set.size() < randomArrange.length) {
			int randomNumber = random.nextInt(randomArrange.length);
			set.add(randomNumber);
		}
		
		Object newArrangement[] = set.toArray();
		
		//set the new sentence
		String newSentence = "";
		for(int counter = 0; counter < randomArrange.length; counter++) {
			newSentence += randomArrange[(int)newArrangement[counter]] + " ";
		}
		System.out.println(newSentence);
	}
	
	/**
	 * extract characters from text
	 * Thread: word1
	 */
	private void extractString() {
		String text = "Nezuko Is super Cute";
		for(int counter = 0; counter < 20; counter++) {
			String subString = text.substring(0, counter + 1);
			System.out.println(subString);
		}
	}
	
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();
		if(threadName.equals("text")) {
			extractString();
		}
		else if(threadName.equals("word1")) {
			rearrangeSentence();
		}
	}
}