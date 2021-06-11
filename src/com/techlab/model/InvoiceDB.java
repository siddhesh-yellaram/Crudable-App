package com.techlab.model;

public class InvoiceDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("\nInvoiceDB Created");
	}

	@Override
	public void read() {
		System.out.println("InvoiceDB Readed");
	}

	@Override
	public void update() {
		System.out.println("InvoiceDB Updated");
	}

	@Override
	public void delete() {
		System.out.println("InvoiceDB Deleted");
	}

}
