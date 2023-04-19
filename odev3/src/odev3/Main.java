package odev3;

import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Mustafa Yiğit","Coşkun", new Date(2003,9,11), "15350403285"));
	
		BaseCustomerManager customerManager2 = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager2.save(new Customer(2,"Engin", "Demiroğ", new Date(1985,1,6), "2113323232"));
	}

}
