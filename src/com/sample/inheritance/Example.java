package com.sample.inheritance;

public class Example {

	public static void main(String[] args) {
		try {
			int i = 9 / 0;
			System.out.println(i);
			return;
		} catch (Exception e) {
			System.out.println("exception caught");
			return;
		}
		//System.out.println("task completed");

	}

}
