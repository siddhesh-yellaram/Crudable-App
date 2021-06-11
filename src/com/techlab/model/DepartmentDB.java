package com.techlab.model;

public class DepartmentDB implements ICrudable {
	@Override
	public void create() {
		System.out.println("\nDepartmentDB Created");
	}

	@Override
	public void read() {
		System.out.println("DepartmentDB Readed");
	}

	@Override
	public void update() {
		System.out.println("DepartmentDB Updated");
	}

	@Override
	public void delete() {
		System.out.println("DepartmentDB Deleted");
	}
}
