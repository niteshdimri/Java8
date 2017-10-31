package com.nitesh.functionalinterface;

import com.nitesh.functionalinterface.interfaces.TestInterface;

public class FunctionalInterfaceClass implements TestInterface {

	@Override
	public void printHello() {
		System.out.println("Hi Nitesh!!");
	}

	public static void main(String[] args) {
		TestInterface testInterface = new FunctionalInterfaceClass();
		testInterface.printHello();
	}
}
