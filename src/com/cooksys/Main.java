package com.cooksys;

public class Main {
	
	public static void main (String[] args) {
		Person will = new Person(23, "Will");
		Person ted = new Person(45, "Ted");
		Person.speak("Hello Ted!");
		Person.speak("Hello Will!");
		System.out.println(will.name);
		System.out.println(ted.name);
		System.out.println(will.age);
		System.out.println(ted.age);
	}

}
