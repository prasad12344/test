package com.samples.string;

public class StringDemo {

	/*
	 * String s1 = "hello"; s1 = "whatsup"; s1="prasad";
	 */
	/*
	 * String[] s1 = new String[5];
	 * 
	 * System.out.println("string length is: " + s1.hashCode());
	 */

	int id;
	String name;
	int age;

	public StringDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StringDemo(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		StringDemo demo=new StringDemo(1, "prasad", 23);
		StringDemo demo1=new StringDemo(1, "prasad", 23);
		
	
	}

}
