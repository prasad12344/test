package com.samples.string;

public class ForEachExample {

	static int x;

	static boolean Catch() {
		x++;
		return true;
	}

	public static void main(String[] args) {
		x = 0;
		if ((Catch() | Catch()) || Catch())
			x++;
		System.out.println(x);
	}

}
