package com.javatraining.deloitte.assessment2;
//Question 1.3

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x="null";
		int l=sc.nextInt();
		int[] a = new int[l];
		
		
		for(int i=0;i<l;++i)
		a[i]=sc.nextInt();
		if(UserMainCode.checkTripplets(a))
		x="TRUE";
		else
		x="FALSE";
		System.out.println(x);
		sc.close();
	}
	

}
