package threaddemos;

class Print
{
	public synchronized static void printSomething(String firstName, String lastName)
	{
		System.out.println("Welcome, "+firstName);
		System.out.println("Bye, "+lastName);
	}
}


public class ThreadDemo2 extends Thread {

	
	private String firstName;
	private String lastName;
	
	public ThreadDemo2(int i, String firstName, String lastName) {
		super(i+"");
		this.firstName = firstName;
		this.lastName = lastName;
		start();
	}



	public void run() {
			Print.printSomething(firstName, lastName);
		}
		
		public static void main(String[] args) {
			new ThreadDemo2(1,"Rahul", "Mehta");
			new ThreadDemo2(2,"Rahul", "Agarwal");
			
			
		}
}

