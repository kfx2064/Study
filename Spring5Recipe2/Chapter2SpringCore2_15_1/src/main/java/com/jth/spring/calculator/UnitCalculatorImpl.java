package com.jth.spring.calculator;

import org.springframework.stereotype.Component;

@Component("unitCalculator")
public class UnitCalculatorImpl implements UnitCalculator {

	@Override
	public double kilogramToPound(double kilogram) {
		double result = 0.0;
		result = kilogram * 2.2;
		System.out.println(kilogram + " kilogram = " + result + " pound");
		return result;
	}

	@Override
	public double kilometerToMile(double kilometer) {
		double result = 0.0;
		result = kilometer * 0.62;
		System.out.println(kilometer + " kilometer = " + result + " mile");
		return result;
	}

}
