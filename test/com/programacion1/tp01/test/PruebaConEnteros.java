package com.programacion1.tp01.test;

/* La finalidad de este ejercicio es poner en práctica el incremento */

public class PruebaConEnteros {
	
	public static void main(String[] args) {
		
		/* Declaración e inicialización de variables */
		
		int maximoValor = 0;
		int nuevoValor = 0;
		
		/* Asignación de variables*/
		
		maximoValor = 2147483647;
		
		
		System.out.println("El valor máximo del entero es: " + maximoValor);
		
		// Le sumo el pedido en la consigna
	//	nuevoValor = ++maximoValor;
		
		System.out.println("El nuevo valor es: " + maximoValor);
		
		/* Explicación de lo que se ve en pantalla:
		 * Dado que nos estamos excediendo de lo que
		 * puede soportar la variable debemos hacer
		 * un widening casting para que lo soporte*/
		long nuevoMaximoValor = (long)maximoValor;
		++nuevoMaximoValor;
		
		System.out.println("El nuevo máximo valor es: " + nuevoMaximoValor);
		
	} // end main

} // end PruebaConEnteros
