import java.util.*;
public class WeatherSystem {
	int temp;
	public WeatherSystem(double temp1) {
		this.temp= temp;
	}
	
	
	public double conversion(double input) {
		double celsius;
		celsius = (input-32)*(0.5556);
		return celsius;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Celsius and 2 for Fahrenheit");
		int input = sc.nextInt();
		
		switch(input)
		{
		case 1:
			System.out.println("Enter the temperature:\n");
			double cel=  sc.nextDouble();
			if((cel>60) || (cel<-10))
			{
				System.out.println("Temperature is in intolerable range");
			}
			else {
				System.out.println("Temperature is Fine");
			}
			break;
		case 2:
			System.out.println("Enter the tempertaure:\n");
			double f = sc.nextDouble();
			WeatherSystem ob = new WeatherSystem(f);
			double k= ob.conversion(f);
			if((k>60) || (k<-10))
			{
				System.out.println("Temperature is in intolerable range");
			}
			else {
				System.out.println("Temperature is Fine");
			}
			break;
			default:
				System.out.println("Invalid choice");
			
		}
		

	}

}
