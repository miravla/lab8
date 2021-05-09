package Exercise1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ThreadExtend extends Thread{

	public void printNum (String currentThreadName)
	{
		
		Calendar cal = Calendar.getInstance();
		Date date  = cal.getTime();             
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = format1.format(date ); 
	    
		for(int i=0 ; i<10 ;i++)
		{
			if(i==0)
			{
			System.out.println(i+1+"st round : "  + currentThreadName + " at " + time );
			}
			else if(i==1)
			{
				System.out.println(i+1+"nd round : " + currentThreadName + " at " + time );
			}
			else if(i==2)
			{
				System.out.println(i+1+"rd round : " + currentThreadName + " at " + time );
			}
			else
				System.out.println(i+1+"nd round : " + currentThreadName + " at " + time );
			
		}
	}
	
	public void run ()
	{
		// Get current thread
		Thread currentThread = Thread.currentThread();
				
		// Execute task
		printNum(currentThread.getName());
	}
	
}