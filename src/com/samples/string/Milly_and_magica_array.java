package com.samples.string;

import java.util.Scanner;

public class Milly_and_magica_array {

/*	public static void main(String s[]) {
		// TODO Auto-generated method stub
		long N = 0; // size of array
		int T = 0;
		long X = 0; // X is the minimum number, T is the test cases

		long count = 0;

		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		for (int k = 0; k < T; k++) {

			N = sc.nextLong();
			long a[] = new long[(int) N];
			X = sc.nextInt();
			int flag = 0;

			if ((T >= 1) && (T <= 10) && (N >= 2) && (N <= 100000) && (X >= 1) && (X <= 1000000000))
				flag = 0;
			else
				flag = 1;

			if (flag != 1)
				for (int i = 0; i < N; i++) {
					a[i] = sc.nextInt();
					if (a[i] < 1 && a[i] > 1000000000) {
						flag = 1;
					}
				}

			if (flag != 1) {
				for (int i = 0; i <= N - 2; i++) {
					if ((a[i] >= a[i + 1])) {
						long k1 = ((a[i] - a[i + 1]) / X + 1);
						a[i + 1] += X * k1;
						count += k1;

					}

				}

				System.out.println(count);
			}
			count = 0;
			flag = 0;
		}

	}*/
	 public static void main(String args[]){  
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");
		   String s4=new String("Sachin");
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool) 
		   System.out.println(s3==s4);
		   System.out.println(s3.equals(s4));
		   System.out.println(s1.equals(s3));
		 }  

}


// # Sample bash code
