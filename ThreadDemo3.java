package threaddemos;
// Creating thread using anonymous class
public class ThreadDemo3 {

	public static void main(String[] args) {
		System.out.println("MIAN CALLED BY :"+ Thread.currentThread().getName());
		Thread t1 = new Thread() // Instead of ; we put a { and create an anonymous class
				{
					@Override
					public void run() {
						System.out.println("RUN CALLED BY: " +Thread.currentThread().getName());
						
					}
				};
				t1.start();

	}

}
