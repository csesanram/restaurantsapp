package com.restaurantsapp.demo.util;

public class Tarun {
	
	public static void main(String[] args) {
		
		//Override
		MultisA parentOverride = new MultisA();
		parentOverride.printMultisRidden();
		MultisA override = new MultisB();
		override.printMultisRidden();
		
		//Overload
		MultisA parentOverload = new MultisA();
		parentOverload.printMultisLoaded(2);
		parentOverload.printMultisLoaded(4, 10);
		
	}

}

class MultisA{
	public void printMultisRidden() {
		System.out.println("Before Override");
		for(int i=1; i <= 10; i++) {
			System.out.println(2 * i);
		}
	}
	public void printMultisLoaded(int x) {
		System.out.println("Before Overload");
		for(int i=1; i <= 10; i++) {
			System.out.println(x * i);
		}
	}
	public void printMultisLoaded(int x, int y) {
		System.out.println("Overloaded");
		for(int i=1; i <= y; i++) {
			System.out.println(x * i);
		}
	}
}

class MultisB extends MultisA{
	public void printMultisRidden() {
		System.out.println("Overriden");
		for(int i=1; i <= 10; i++) {
			System.out.println(4 * i);
		}
	}
}

