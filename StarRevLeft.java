package com.xworkz.xworkzapp.starpattern;

public class StarRevLeft {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==j||j==n-1||i==0) {
					System.out.print(i+""+j+" ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();

		}
	}

}
