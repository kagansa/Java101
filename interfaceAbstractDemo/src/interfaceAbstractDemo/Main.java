package interfaceAbstractDemo;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Kaðan");
		customer.setLastName("Saygýn");		
		customer.setDateOfBirth(new Date(1994,1,23));
		customer.setNationalityId("12062575334");
		
		//BaseCustomerManager customerManager = new NeroCustomerManager();
		//BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.Save(customer);

	}

}
