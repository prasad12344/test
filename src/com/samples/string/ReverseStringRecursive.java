package com.samples.string;

public class ReverseStringRecursive {
	
	public static void main(String[] args) {
		ReverseStringRecursive recursive=new ReverseStringRecursive();
		String name="my java";
		StringBuffer buffer=new StringBuffer(name);
		System.out.println(buffer.reverse());
	}

}
