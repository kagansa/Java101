package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService _customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}
	
	
	@Override
	public void Save(Customer customer) {
		
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
			System.out.println("valid perseon : " + customer.getFirstName());
		}
		else {
		
			System.out.println("Not a valid perseon " + customer.getFirstName());
		}
		
	}
	

}
