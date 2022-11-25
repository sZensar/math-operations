package com.numbers;

import com.numbers.hcf.HcfNumberOperation;

public class NumberOperations {
	public static void main(String[] args) {
		int numbers[] = { 32, 64, 128, 16, 512, 1024, 2048, 256 };
		
		HcfNumberOperation hcfNumberOperation = new HcfNumberOperation();
		int hcfNumber = hcfNumberOperation.highestCommonFactor(numbers);
		
		System.out.println("highest common factor of given array is :: " + hcfNumber);
	}
}