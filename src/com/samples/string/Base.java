package com.samples.string;

public class Base {
	private  void display() {
		System.out.println("Static or class method from Base");
	}

	public void print() {
		System.out.println("Non-static or instance method from Base");
	}

	class Derived extends Base {
		private void display1() {
			System.out.println("Static or class method from Derived");
		}

		public void print() {
			System.out.println("Non-static or instance method from Derived");
		}

		public  class test {
			public  void main(String args[]) {
				Base obj = new Derived();
				obj.print();
				//System.out.println(obj.display());
				
			}

		}
	}
}
