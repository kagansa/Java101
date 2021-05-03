package interfaceAbstractDemo;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Kağan");
		customer.setLastName("Saygın");		
		customer.setDateOfBirth(new Date(1994,1,23));
		customer.setNationalityId("000000000");
		
		//BaseCustomerManager customerManager = new NeroCustomerManager();
		//BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.Save(customer);

	}

}
