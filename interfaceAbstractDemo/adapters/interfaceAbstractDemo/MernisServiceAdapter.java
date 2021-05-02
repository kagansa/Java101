package interfaceAbstractDemo;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		  
     KPSPublicSoap client = new KPSPublicSoapProxy();	
     
     int year = customer.getDateOfBirth().getYear();
     
     boolean result = false;
	 
	try {
		result = client.TCKimlikNoDogrula(customer.getLongNationalityId(), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), year );
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
		return result;

		
		
	}

}
