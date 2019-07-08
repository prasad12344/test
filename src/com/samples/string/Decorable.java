package com.samples.string;

public interface Decorable {

	 default void decorateWithPaints() {
		System.out.println("Decorate using paints");
	}

}
