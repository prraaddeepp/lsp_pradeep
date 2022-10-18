package org.howard.edu.lsp.assignment3;

public class Driver {
	public static void main(String[] args) {
		Combination combination = new Combination();
		combination.combinationSet(new int[] {5,5,15,10}, 15);
		System.out.println("");
		
		combination.combinationSet(new int[] {1,2,3,4,5,6}, 6);
		
		int[] arr = new int[100];
		for (int i = 0; i <100; ++i) {
			arr[i] = i;
		}
	}
}