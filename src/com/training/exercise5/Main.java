package com.training.exercise5;

public class Main {

	public static void main(String[] args) {
		
		MaximumProduct solution = new MaximumProduct();
		int[] arr = {3, 4, 6, 1, 7, 2, 9};
		int result;
		//debe regresar el producto de 9*7 = 63
		result = solution.maximumProduct(arr);
		
		System.out.println("The maximum prodcut of this array is: "+result);
	}
}
