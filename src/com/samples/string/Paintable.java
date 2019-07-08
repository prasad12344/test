package com.samples.string;

public interface Paintable {
	default void decorateWithPaints()
    {        
        System.out.println("Decorate using paints");  
    }
}
