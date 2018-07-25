package collectiondemos;


class A
{
	String password = "heloo@123";
	public class ChangePassword	// nested class
	{
		public void display()
		{
			
			System.out.println("Original :" + password);
			password = "abc@121212";
			
		}
	}
	public void changePwd()
	{
		ChangePassword password = new ChangePassword();
		password.display();
		System.out.println("Changed password :" +password);
		
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		A a = new A();
		a.changePwd();
		

	}

}
