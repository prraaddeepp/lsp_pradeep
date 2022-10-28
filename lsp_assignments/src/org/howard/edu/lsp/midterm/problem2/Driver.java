package org.howard.edu.lsp.midterm.problem2;

public class Driver {
	public static void main(String args[]){
		
		Person p = new Person("Pradeep", "50", 21);
		System.out.println(p.toString());
		
		
		Person r = new Person("Rajan", "50", 90);
		System.out.println(r.toString());
		
		System.out.println(p.equals(r));
		System.out.println(r.equals(p));
	}
}