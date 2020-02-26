package com.cc.interfaces;

//@FunctionalInterface
public interface Foo {

	default void print() {
		System.out.println("I can print!");
	}

	default void sum(int a, int b) {
		System.out.println("I can sum!");
	}
}
