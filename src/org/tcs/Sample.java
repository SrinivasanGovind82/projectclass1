package org.tcs;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Employee id:");
		int id = s.nextInt();
		System.out.println("Employee id is:" + id);
		System.out.println("Employee name is:");
		String name = s.next();
		System.out.println("Employee name is:" + name);
		System.out.println("Employee email is :");
		String eMail = s.next();
		System.out.println("employee email id:" + eMail);
		System.out.println("employee phno :");
		long phNo = s.nextLong();
		System.out.println("employee phNo :" + phNo);
		System.out.println("employee salary:");
		Float sal = s.nextFloat();
		System.out.println("employee salary:" + sal);
		System.out.println("employee gender :");
		String gen = s.next();
		System.out.println("employee Gender is:" + gen);
		System.out.println("employee city:");
		String city = s.next();
		System.out.println("employee city is:" + city);

	}

}
