package com.javatraining.deloitte.assessment2;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		Arithmetic n1 =  new Addition();
		Arithmetic n2 =  new Subtraction();
		Arithmetic n3 =  new Multiplication();
		Arithmetic n4 =  new Division();

		Arithmetic[] a = {n1, n2, n3, n4};
		int choice;	
		System.out.println("1. Addition \n2.Subtraction \n3.Multiplication \n4.Division");
		System.out.println("Enter your choice: ");
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
		System.out.println("Enter two numers: ");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		System.out.println("Result is: " + a[choice-1].calculate(num1, num2));
		scanner.close();
		}
	
	}


