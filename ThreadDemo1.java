package threaddemos;

public class ThreadDemo1 extends Thread // we can also write implements Runnable in place of extends Thread
{
	Thread t1; // thread is not born here, but it is present
	public ThreadDemo1() {
		t1 = new Thread(this);
		t1.setName("Childthread");// we can use any class name in place of 'this'
		t1.start(); //thread is born and is executed by main thread only
		System.out.println("t1 started by: " +Thread.currentThread().getName()); // also executed by main thread and is executed first
	}
	
	public void run()
	{
		System.out.println("Wait for 2 seconds for the Score thread to execute...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Run called:" +Thread.currentThread().getName()); // this is the life of the child thread t1
	}
	public static void main(String[] args) {
		Thread m = Thread.currentThread(); // By this we can also rename the main thread
		m.setName("Main threadwa"); // Main thread renamed here
		System.out.println("Wait for 2 seconds for the program to start...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadDemo1 d = new ThreadDemo1();
		System.out.println("Message shown by: " +Thread.currentThread().getName());
	}

}
