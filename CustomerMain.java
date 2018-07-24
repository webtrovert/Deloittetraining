package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerMain {

	public static void main(String[] args) {
		List<Customer> allCustomers = new ArrayList<Customer>();
		
		Customer c1 = new Customer(10, "Jaya", "Pune",75000);
		allCustomers.add(c1);
		allCustomers.add(new Customer(11, "Uma", "Pune", 75400));
		allCustomers.add(new Customer(12, "Ritu", "Jaipur", 80000));
		allCustomers.add(new Customer(13, "Sakshi", "Delhi", 45000));
		allCustomers.add(new Customer(14, "Gaurav", "Kolkata", 95000));
		allCustomers.add(new Customer(15, "Yamini", "Banaglore", 7500));
		
		System.out.println(allCustomers); // To print all at the same time
		//To print one by one, do the following -
		System.out.println("Printing all customer details:");
				for(Customer customer:allCustomers)
				{
					System.out.println(customer);
				}
				Collections.sort(allCustomers);
				
				System.out.println("After sorting customer details:");
				for (Customer customer:allCustomers)
				{
					System.out.println(customer);
				}
				
				//For sorting using comparator-
				Collections.sort(allCustomers, new CustomerAddressComparator());
				System.out.println("After sorting via comparator customer details:");
				for (Customer customer:allCustomers)
				{
					System.out.println(customer);
				}
				
	}

}
