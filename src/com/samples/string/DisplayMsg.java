package com.samples.string;

import java.util.ArrayList;
import java.util.List;

public class DisplayMsg {

	public static void main(String args[]) {

		List<Integer> list = new ArrayList<>();
		list.add(123);
		list.add(1234);
		list.add(123);
		list.size();
		
		for (Integer integer : list) {
			//list.add(234);
			System.out.println(integer);
			
		}

	}

}
