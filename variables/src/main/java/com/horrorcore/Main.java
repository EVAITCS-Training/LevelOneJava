package com.horrorcore;

import java.util.Arrays;

// We are talking about Variables for Java
// Primetive Vs Reference Variables


//This is an invalid Variable since it is Outside the class


//Unlike JavaScript every variable needs to be in a class
//int num = 10;

public class Main {
	int num = 'A';
	//Primitive Types
	// Number/Integer
	// byte, short, int, long
	// Decimal Number
	// float and double
	public static void main(String... args) {
		int charater = 'A';
		System.out.println(charater);
		int secondChar = 'A';
		System.out.println(charater + secondChar);
		//int char = 190; <- Invalid due to trying to use the char keyword as variable name
		// Refences DataTypes
		// All References begin with a Capital Letter
		// String, Integer, Byte, Short, Long, Double, Float
		Integer num2 = 10;
		// Auto Boxing
		// Automatically Boxes the Primitive value inside the Object Version
		// Type Casting Variables
		//This is Narrow Casting
		long smallNumber = 10l;
		byte betterMemory = (byte) smallNumber;
		//Widening Casting
		int exampleNum = 8000000;
		long biggerNumVar = exampleNum;
		//array
		//Array can be applied to any datatype
		int[] numArray = new int[10];
		String[] strArray = new String[10];

		strArray[0] = "Hello";
		System.out.println(Arrays.toString(strArray));
		System.out.println(strArray[0]);
	}
}

