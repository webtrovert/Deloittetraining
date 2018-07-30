package com.javatraining.deloitte.assessment2;
//Question1.2
public class EmplyeeBo {
	public static void calincomeTax(EmplyeeVo e)
	{
	double income = e.getAnnualincome();


	if(income<=250000)
	{
	e.setIncometax(0);
	}
	else if(income>250000 && income<=500000)
	{

	e.setIncometax(0.05*income);
	}
	else if(income>500000 && income<=1000000)
	{
	e.setIncometax(0.2*income);

	}
	else
	{
	e.setIncometax(0.3*income);
	}


	}
}
