package com.javatraining.deloitte.assessment2;
//Question1.2
import java.util.Scanner;

public class EmplyeeMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of employees");
		int noe = sc.nextInt(); //number of employees

		EmplyeeVo [] e = new EmplyeeVo[noe];
		for(int i=0;i<e.length;i++)
		{
		e[i]= new EmplyeeVo(i, null, i, i);
		}

		EmplyeeVo f = new EmplyeeVo(noe, null, noe, noe);


		for (int i = 0; i <e.length; i++) {
		System.out.println("enter employee id of employee "+(i+1));
		int t = sc.nextInt();
		e[i].setEmpid(t);
		System.out.println("enter employee name of employee "+(i+1));
		e[i].setEmpname(sc.next());
		System.out.println("enter employee annual income of employee "+(i+1));
		e[i].setAnnualincome(sc.nextDouble());

		EmplyeeBo.calincomeTax(e[i]);
		System.out.println("all the data of employee"+(i+1)+"are entered");

		}

		for (int i = 0; i < e.length; i++) {
		System.out.println("employee id of employee " +(i+1)+"is "+e[i].getEmpid());
		System.out.println("employee name of employee " +(i+1)+"is "+e[i].getEmpname());
		System.out.println("annual income of employee " +(i+1)+"is "+e[i].getAnnualincome());
		System.out.println("income tax of employee " +(i+1)+"is "+e[i].getIncometax());
		}

		for (int  i= 0; i < e.length; i++) {
		for (int j = i+1; j < e.length; j++) {
		if(e[i].getIncometax()<e[j].getIncometax())
		{
		f  = e[i];
		e[i]=e[j];
		e[j]=f;
		}
		}

		}
		System.out.println("the sorted array is ");
		for (int i = 0; i < e.length; i++) {
		System.out.println("employee id of employee " +(i+1)+"is "+e[i].getEmpid());
		System.out.println("employee name of employee " +(i+1)+"is "+e[i].getEmpname());
		System.out.println("annual income of employee " +(i+1)+"is "+e[i].getAnnualincome());
		System.out.println("income tax of employee " +(i+1)+"is "+e[i].getIncometax());
		sc.close();
		}





		}

}
