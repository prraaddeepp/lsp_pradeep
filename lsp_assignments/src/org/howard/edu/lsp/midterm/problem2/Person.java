package org.howard.edu.lsp.midterm.problem2;

public class Person {
	private String name;
	private int age;
	private String socialSecurityNumber;
	
	Person(String name, String socialSecurityNumber, int age){
		this.name=name;
		this.age=age;
		this.socialSecurityNumber=socialSecurityNumber;	
	};
	public String toString() {
		return "The name is " + this.name+"\n"+ "The age is "+ this.age+"\n"+ "The SSN is " + this.socialSecurityNumber;
		
	};
	
	public String equals(Person y) {
		if (this.socialSecurityNumber==y.socialSecurityNumber) {
			return "Same!";
		}
		return "Not the same!";
	}
}


