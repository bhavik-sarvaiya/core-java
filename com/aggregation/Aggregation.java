package com.aggregation;

public class Aggregation {
	
	void display(Employee employee){
		System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getContactNo());
		System.out.println(employee.getAddress().getId()+" "+employee.getAddress().getType()
				+" "+employee.getAddress().getCity()+" "+employee.getAddress().getState()
				+" "+employee.getAddress().getPincode());
	}

	public static void main(String s[]) {
		Address address = new Address(1,"home","vadodara","gujarat","390023");
		Address address1 = new Address(2,"office","vadodara","gujarat","390007");
		
		
		Employee employee = new Employee(1,"Harsh","1234567891",address);
		Employee employee1 = new Employee(2,"krunal","1234567891",address1);
		Employee employee2 = new Employee(3,"jay","1234567891",address1);
		
		Aggregation aggregation = new Aggregation();
		aggregation.display(employee);
		aggregation.display(employee1);
		aggregation.display(employee2);
	}
}
