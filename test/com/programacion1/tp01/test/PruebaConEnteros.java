package com.programacion1.tp01.test;

/* La finalidad de este ejercicio es poner en pr�ctica el incremento */

public class PruebaConEnteros {
	
	public static void main(String[] args) {
		
		/* Declaraci�n e inicializaci�n de variables */
		
		int maximoValor = 0;
		int nuevoValor = 0;
		
		/* Asignaci�n de variables*/
		
		maximoValor = 2147483647;
		
		
		System.out.println("El valor m�ximo del entero es: " + maximoValor);
		
		// Le sumo el pedido en la consigna
	//	nuevoValor = ++maximoValor;
		
		System.out.println("El nuevo valor es: " + maximoValor);
		
		/* Explicaci�n de lo que se ve en pantalla:
		 * Dado que nos estamos excediendo de lo que
		 * puede soportar la variable debemos hacer
		 * un widening casting para que lo soporte*/
		long nuevoMaximoValor = (long)maximoValor;
		++nuevoMaximoValor;
		
		System.out.println("El nuevo m�ximo valor es: " + nuevoMaximoValor);
		
	} // end main

} // end PruebaConEnteros
