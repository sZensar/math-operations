package com.numbers.hcf;

public class HcfNumberOperation {
	
	/**
	 * @param elements
	 * @return HCF number from given elements.
	 */
	public int highestCommonFactor(int[] elements) {
		int result = elements[0];
		for (int element : elements) {
			result = computeHcf(result, element);
			if (result == 1) {
				return 1;
			}
		}
		return result;
	}

	private int computeHcf(int result, int element) {
		if (result == 0) {
			return element;
		}
		return computeHcf(element % result, result);
	}
}