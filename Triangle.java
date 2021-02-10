package com.xworkz.xworkzapp.starpattern;

public class Triangle {

	public static void main(String[] args) {
		Triangle tri = new Triangle();
		// tri.triangle(5);
		// tri.revTriangle(7);
		tri.daimond(15);
	}

	void triangle(int n) {
		int mid = n / 2;
		for (int i = 0; i < n - mid; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == mid || j - i == mid || i == mid) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

	void revTriangle(int n) {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i - j == mid || i + j == mid * 3 || i == mid) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

	void daimond(int n) {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == mid || i - j == mid || j - i == mid || i + j == mid * 3) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
