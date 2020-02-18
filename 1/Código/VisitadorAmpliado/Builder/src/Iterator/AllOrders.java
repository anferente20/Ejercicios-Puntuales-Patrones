package Iterator;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class AllOrders {
	private Vector data;
	
	public AllOrders() {
		
	}
	
	public Enumeration getAllOrders() {
		return data.elements();
	}
	public Iterator getAdministratorOrders(String key) {
		return new AdministratorOrders(this);
	}
	
}
