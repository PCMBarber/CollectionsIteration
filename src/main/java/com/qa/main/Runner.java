package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		CollectionsExample app = new CollectionsExample();
		System.out.println("---Array-Example---");
		app.startArray();
		System.out.println("---ArrayList-Example---");
		app.startArrayList();
		System.out.println("---ArrayList-Changing-Values-Example---");
		app.startArrayListChangeValues();
		System.out.println("---ArrayList-Custom-Objects-Example---");
		app.startArrayListObject();
		System.out.println("---Main-Class-End---");
	}
}
