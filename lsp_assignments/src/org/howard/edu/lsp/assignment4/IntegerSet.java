package org.howard.edu.lsp.assignment4;

import java.util.*;

/**
 * 
 * @author pradep
 *
 */

public class IntegerSet {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set= new ArrayList<Integer>();
	
	/**
	 * Default Constructor
	 */
	public IntegerSet(){
		
	};
	/**
	 * Clears the internal representation of the set
	 */
	public void clear() {
		set.clear();
	};
	/**
	 * Returns the length of the set
	 * @return length
	 */
	public int length() {
		return set.size();
	};
	/**
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	 */
	public boolean equals(IntegerSet b) {
		ArrayList<Integer> a=(ArrayList<Integer>) b.set;
		if (set.size() != a.size()){
			return false;
		}
		for (int i = 0; i < a.size(); i++) {
			if (set.contains(a.get(i))) {	
			}else{
				return false;
			};
		};
		return true;	
	};
	/**
	 * Returns true if the set contains the value, otherwise false
	 */
	public boolean contains(int value) {
		return set.contains(value);
	};
	/**
	 * Returns the largest item in the set; Throws a IntegerSetException if the set is empty
	 */
	public int largest() throws IntegerSetException{
		if (length() == 0) {
			throw new IntegerSetException();
		}
		int max_val = 0;
		for (int i = 0; i < length(); i++) {
			if (set.get(i) > max_val) {
				max_val = set.get(i);
			};
		}
		return max_val;
	}
	/**
	 * Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 */
	public int smallest() throws IntegerSetException{
		if (length() == 0) {
			throw new IntegerSetException();
		};
		int min_val = set.get(0);
		for (int i = 1; i < length(); i++) {
			if (set.get(i) < min_val) {
				min_val = set.get(i);
			};
		};
		return min_val;
	};
	/**
	 * Adds an item to the set or does nothing it already there
	 */
	public void add(int item) {
		if (set.contains(item)) {
			return;
		}
		else {
			set.add(item);
		};
	};
	/**
	 * Removes an item from the set or does nothing if not there and throws  a IntegerSetException error if set is empty
	 */
	public void remove(int item) throws IntegerSetException{
		if (length() == 0) {
			throw new IntegerSetException();
		};
		if ((length() > 0) & (set.contains(item))){
			set.remove(Integer.valueOf(item));
		};
	};
	/**
	 * unions two set (Set Union)
	 */
	public void union(IntegerSet intSetb) {
		ArrayList<Integer> b=(ArrayList<Integer>) intSetb.set;
		for (int i = 0;i<b.size();i++) {
			if (set.contains(b.get(i))) {
			}else {
				set.add(b.get(i));
			}
		}
	};
	/**
	 * intersects two set
	 */
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> b=(ArrayList<Integer>) intSetb.set;
		set.retainAll(b);
	};
	/**
	 * difference of two set
	 */
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> b=(ArrayList<Integer>) intSetb.set;
		set.removeAll(b);
	};
	/**
	 * Returns true if the set is empty, false otherwise
	 */
	public boolean isEmpty() {
		return set.isEmpty();
	};
	/**
	 * Return String representation of your set
	 */
	public String toString() {
		String setStr = "";
		for (int i=0;i<length();i++) {
			setStr += Integer.toString(set.get(i));
		}
		return setStr;
	};
};