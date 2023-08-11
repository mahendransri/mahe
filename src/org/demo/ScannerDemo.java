package org.demo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("student Id ");
		int nextInt = s.nextInt();
		System.out.println("studentName");
		String next = s.next();
		System.out.println("mark1");
		int nextInt1 = s.nextInt();
		System.out.println("mark2");
		int nextInt2 = s.nextInt();
		System.out.println("mark3");
		int nextInt3 = s.nextInt();
		System.out.println("mark4");
		int nextInt4 = s.nextInt();
		System.out.println("mark5");
		int nextInt5 = s.nextInt();
		
		
		System.out.println("\nEMPLOYEE DETAILS");
		System.out.println("================");
		System.out.println("student Id:"+nextInt);
		System.out.println("studentName:"+next);
		System.out.println("mark1:"+nextInt1);
		System.out.println("mark2:"+nextInt2);
		System.out.println("mark3:"+nextInt3);
		System.out.println("mark4:"+nextInt4);
		System.out.println("mark5:"+nextInt5);
		
		
		
	}
}

