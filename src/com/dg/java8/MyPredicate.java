package com.dg.java8;

@FunctionalInterface
public interface MyPredicate<T> {

	public boolean test(T t);
	
}
