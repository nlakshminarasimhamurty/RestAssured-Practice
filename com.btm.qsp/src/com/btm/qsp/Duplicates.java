package com.btm.qsp;

public class Duplicates {

	public static void main(String[] args) {

		int[] a = { 10, 30, 30, 20, 10, 5, 6, 5, 10 };

		for (int i = 1; i <=
				
				
				
				
				a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println(a[j]);

				}
			}

		}

	}

}
