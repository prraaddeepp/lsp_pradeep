package org.howard.edu.lsp.assignment4;
import java.util.*;
import org.howard.edu.lsp.assignment4.*;

/**
 * Tests the functionality of IntegerSet class
 * @author pradep
 *
 */
public class Driver {
	/**
	 * 
	 * @param args N/A
	 * @throws IntegerSetException if set is empty
	 */
	public static void main(String[] args) throws IntegerSetException {
		
		IntegerSet set1 = new IntegerSet();

		set1.add(1);
		set1.add(2);
		set1.add(3);

		System.out.println("Value of Set1 is:"+set1.toString());
		System.out.println("Smallest value of Set1 is:"+set1.smallest());
		System.out.println("Largest value of Set1 is:"+set1.largest());
		

		IntegerSet set2 = new IntegerSet();
		set2.add(4);
		set2.add(5);
		set2.add(3);
		
		System.out.println("Value of Set2 is:"+set2.toString());
		set1.union(set2);
		System.out.println("Result of union of Set1 and Set2:"+set1.toString());
		set1.intersect(set2);
		System.out.println("Result of intersection of Set1 and Set2:"+set1.toString());
		set1.diff(set2);
		System.out.println("Result of difference of Set1 and Set2:"+set1.toString());
		System.out.println(set1.isEmpty());
		

		try {
			IntegerSet a = new IntegerSet();
			a.largest();
		}catch (IntegerSetException e){
			System.out.println(e.getMessage());
		}
		try {
			IntegerSet a = new IntegerSet();
			a.smallest();
		}catch (IntegerSetException e){
			System.out.println(e.getMessage());
		}

		set1.add(6);
		System.out.println("Value of Set1 is:"+set1.toString());
	
		System.out.println(set1.contains(6));

		set1.remove(6);

		System.out.println(set1.contains(6));
		System.out.println("Value of Set1 is:"+set1.toString());

		set1.add(9);
		set1.add(10);
		System.out.println("Value of Set1 is:"+set1.toString());

		set1.clear();

		try {
			IntegerSet a = new IntegerSet();
			a.remove(6);
		}catch (IntegerSetException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Value of Set1 is:"+set1.toString());
	
		set1.add(4);

		set1.add(4);
		set1.add(3);
		set1.add(5);

		set1.remove(6);
		System.out.println("Value of Set1 is:"+set1.toString());
		System.out.println("Value of Set2 is:"+set2.toString());

		System.out.println(set1.equals(set2));

		set2.remove(4);

		System.out.println(set1.equals(set2));

		System.out.println(set1.length());
	}

}