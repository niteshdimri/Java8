package com.nitesh.functionalinterface.interfaces;

@FunctionalInterface
public interface TestInterface extends ParentInterface {
	public abstract void printHello();
	
	int hashCode();
	String toString();

}
