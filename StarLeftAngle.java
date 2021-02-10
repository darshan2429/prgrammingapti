package com.xworkz.xworkzapp.starpattern;

public class StarLeftAngle {
	public static void main(String[] args) {
		int n=6;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i+j==n-1 || i==n-1|| j ==n-1) {
					System.out.print(i+""+j + " ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();

		}
	}

}
