package com.techlab.test;

import com.techlab.model.CustomerDB;
import com.techlab.model.DepartmentDB;
import com.techlab.model.ICrudable;
import com.techlab.model.InvoiceDB;

public class CrudableTest {

	public static void main(String[] args) {
		doDatabaseOperation(new CustomerDB());
		doDatabaseOperation(new InvoiceDB());
		doDatabaseOperation(new DepartmentDB());
	}
	
	public static void doDatabaseOperation(ICrudable i) {
		i.create();
		i.read();
		i.update();
		i.delete();
	}
}
