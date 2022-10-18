package org.howard.edu.lsp.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {
	static boolean[][]dp;
	public static void combinationSet(int[] input, int sum) {
		int n = input.length;
		ArrayList<Integer> list = new ArrayList<Integer>(input.length);
		for (int i = 0; i < input.length; i++)
		  list.add(Integer.valueOf(input[i]));
		if (input.length == 0) {      
			System.out.println("[]");	//For the case when empty list is passed
		}
		if (n ==0 || sum <0) {
			return;
		}
		dp = new boolean[n][sum +1];
		for (int i =0; i<n; ++i) {
			dp[i][0] = true;
		}
		if (input[0] <=sum) {
			dp[0][input[0]] = true;
		}
		for (int i =1; i <n; ++i)
			for (int j = 0; j <sum +1; ++j)
				dp[i][j] = (input[i]<= j) ? (dp[i-1][j] || dp[i-1][j-input[i]]) : dp[i-1][j];
		if (dp[n-1][sum] == false){
			System.out.println("[]" );
			return;
		}
		ArrayList<Integer> arr = new ArrayList<>();
		recursion(input, n-1, sum, arr);
		
	}
	static void recursion(int input[], int i, int sum, ArrayList<Integer> num) {
		if (i ==0 && sum !=0 && dp[0][sum]) {
			num.add(i);
			System.out.println(num);
			num.clear();
			return;
		}
		if (i == 0 && sum == 0) {
			System.out.println(num);
			num.clear();
			return;
		}
		if (dp[i-1][sum]) {
			ArrayList<Integer> b = new ArrayList<>();
			b.addAll(num);
			recursion(input, i-1, sum, b);
		}
		if (sum >= input[i] && dp[i-1][sum-input[i]]) {
			num.add(i);
			recursion(input, i-1,sum-input[i],num);
		}
	}
}