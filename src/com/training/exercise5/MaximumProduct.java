package com.training.exercise5;

/*
 * receive an array of integers and return the maximum product of that array
 * example: [3, 8, 6, 4, 5, 9]   maximumProduct = 8*9 = 72
 */

public class MaximumProduct {
	
	public int maximumProduct(int[] arr) {
		
		int max = 0;
		
		//no hay dos elementos, por lo que no se puede sacar un producto
		if(arr.length < 2) {
			System.out.println("No hay un producto máximo, el arreglo tiene menos de 2 elementos");
			return max;
		}
		
		//recorrer el arreglo
		for(int i = 0; i < arr.length; i++) {
			//recorrer el arreglo en la siguiente posición
			for(int j = i+1; j < arr.length; j++) {
				//si el primer elemento POR el segundo son mayores al valor de max, se actualiza a ese
				if(arr[i]*arr[j] > max) {
					max = arr[i]*arr[j];
				}
			}
		}
		
		return max;
	}
}
