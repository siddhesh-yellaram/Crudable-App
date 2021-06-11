package com.techlab.model;

public class CustomerDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("\nCustomerDB Created");
	}

	@Override
	public void read() {
		System.out.println("CustomerDB Readed");
	}

	@Override
	public void update() {
		System.out.println("CustomerDB Updated");
	}

	@Override
	public void delete() {
		System.out.println("CustomerDB Deleted");
	}
	
}
