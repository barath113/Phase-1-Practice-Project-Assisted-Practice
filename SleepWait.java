
public class SleepWait {
	
	private static Object LOCK = new Object();

	public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(1000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' Wakeup after sleeping for 1 second");
        synchronized (LOCK) 
        {
            LOCK.wait(1000);
            System.out.println("Object '" + LOCK + "' Wakeup after" + " waiting for 1 second");
        }
    }

}