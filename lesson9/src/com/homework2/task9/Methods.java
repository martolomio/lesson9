package com.homework2.task9;

public class Methods {
	private double num;
	private double num2;
	
	public double getNum() {
		return num;
	}
	public double getNum2() {
		return num2;
	}

	public void  Minus(double num, double num2) throws MyException {
		if(num< 0 & num2 < 0) {
			double result = num - num2;
			System.out.println("Minus  " +result);
		}else {
			String massege = "IllegalArgumentException";
			throw new MyException(massege);
		}	
	}
	
	public void  Plus(double num, double num2) throws MyException {
		if(num > 0 & num2 > 0) {
			double result = num + num2;
			System.out.println("Plus  " + result);
		}else {
			String massege = " MyException";
			throw new MyException(massege);
		}
	}
	
	public void Divide(double num, double num2) throws MyException {
		
		double result = num / num2;
		System.out.println("Devide  " + result);
		
		if(num == 0 & num2 != 0 || num !=0 & num2 ==0) {
			String massege = "ArithmeticException";
			throw new MyException(massege);
		}	
	}
	
	public void  Multiply(double num, double num2) throws MyException {
		
		double result = num * num2;
		System.out.println("Multiply  " + result);
		
		if(num== 0 & num2 == 0) {
			String massege = "IllegalArgumentException";
			throw new MyException(massege);
		}
	}
	
}
