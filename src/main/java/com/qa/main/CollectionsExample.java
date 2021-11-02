package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class CollectionsExample {
	
	public void startArray() {
		int[] intArray = new int[50]; // New Array with 50 blank spots
		
		for(int i = 1; i<=50; i++) { // Add numbers 1 to 50 to Array
			intArray[i-1]=i;
		}
		System.out.println("Standard For Loop");
		for(int i = 0; i<intArray.length; i++) { // Standard for loop
			System.out.println(intArray[i]); // Print numbers from Array iteratively
		}
		System.out.println("Enhanced For Loop");
		for(int value: intArray) { // Enhanced for loop
			System.out.println(value); // Print numbers from Array iteratively
		}
	}
	
	public void startArrayList() {
		List<Integer> intArray = new ArrayList<Integer>(); // New ArrayList with no values
		
		for(int i = 1; i<=50; i++) { // Add numbers 1 to 50 to ArrayList
			intArray.add(i);
		}
		System.out.println("Standard For Loop");
		for(int i = 0; i<intArray.size(); i++) { // Standard for loop
			System.out.println(intArray.get(i)); // Print numbers from ArrayList iteratively
		}
		System.out.println("Enhanced For Loop");
		for(int value: intArray) { // Enhanced for loop
			System.out.println(value); // Print numbers from ArrayList iteratively
		}
	}
	
	public void startArrayListChangeValues() {
		List<Integer> intArray = new ArrayList<Integer>(); // New ArrayList with no values
		
		for(int i = 1; i<=50; i++) { // Add numbers 1 to 50 to ArrayList
			intArray.add(i);
		}
		for(int value: intArray) { // Enhanced for loop
			System.out.println(value); // Print numbers from ArrayList iteratively
		}
		System.out.println("Changing Values");
		for(int i = 100; i>50; i--) { // Change numbers for 100 to 50
			intArray.set(Math.abs(i-100),i); // Math.abs() returns the ABSOLUTE value 
			// -5 becomes 5, 2 stays the same
		}
		for(int value: intArray) { // Enhanced for loop
			System.out.println(value); // Print numbers from ArrayList iteratively
		}
	}
	
	public void startArrayListObject() {
		String[] traineeNames = {"Pilleriina","Saleha","Jack","Joshua","Lewis","Doniel"};
		int[] traineeAge = {12, 16, 157, 3, 666, 5318008};
		
		List<DFETrainee> traineeArray = new ArrayList<DFETrainee>();
		
		for(int i = 0; i<traineeNames.length && i<traineeAge.length; i++) { 
			traineeArray.add(new DFETrainee(traineeNames[i],traineeAge[i]));
			// Creates a new DFETrainee Object on every iteration and adds to the ArrayList
		}
		
		System.out.println("Access Whole Object");
		for(DFETrainee value: traineeArray) { // Enhanced for loop
			System.out.println(value); // Print trainee from ArrayList iteratively
			// Note: the print function intrinsically converts the object to a string
			// using the 'toString()' method in the DFETrainee class
		}
		
		System.out.println("Access One Data-Point In Object");
		for(DFETrainee value: traineeArray) {
			System.out.println("Name: "+value.getName()); // Use the method getName() on
			// each Object as they are iterated though using the for loop
		}
	}
}
