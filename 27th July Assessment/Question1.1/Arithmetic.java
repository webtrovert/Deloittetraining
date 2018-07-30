package com.javatraining.deloitte.assessment2;

abstract class Arithmetic {
	int num1, num2, result;
	public abstract int calculate(int num1, int num2);

	//returns num1
	public int getNum1() {
	return num1;
	}

	//sets num1
	public void setNum1(int num1) {
	this.num1 = num1;
	}

	//returns num2
	public int getNum2() {
	return num2;
	}

	//sets num2
	public void setNum2(int num2) {
	this.num2 = num2;
	}
}
	
