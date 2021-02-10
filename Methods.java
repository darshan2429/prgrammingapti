package com.xworkz.xworkzapp.starpattern;


public class Methods {
	 static String[] array={"darshan","ali"};
	static int[] array1={10,20,30,40};

	// Methods method = new Methods();

	public static void main(String[] args) {
		returnVal(array);
		System.out.println("name is : " + array);
		returnVal1(array1);
		System.out.println("number is : " + array1);
	}

	public static  String[] returnVal(String[] array) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter name : ");
//		String array = scanner.next();
//		System.out.println("name is : "+ array);
		return array;
	}
	private static int[] returnVal1(int[] array1) {
		return array1;
		
	}

}
// output
//name is : [Ljava.lang.String;@15db9742 
//this is fully qualified class String array   ,@15db9742 data is stored in this adsress  