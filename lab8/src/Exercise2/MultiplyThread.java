package Exercise2;


import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class MultiplyThread implements Runnable{

	// rearrange sentence in random
	 
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
		if(threadName.equals("text")) {
			extractString();
		}
		else if(threadName.equals("word1")) {
			rearrangeSentence();
		}
	}
}