package com.cooksys;

public class Person {
	
	static int age;
	String name;
	
	public Person () {}
	
	public Person (int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public Person (int age) {
		this.age = age;
	}

	public static void speak (String sentence) {
		System.out.println(sentence);
	}
	
	public void speak (String sentence, String punctuation) {
		System.out.println(sentence + punctuation);
	}
	
	public void setName (String name) {
		this.name = name;
	}

}
