package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {
	/* Crear un métod. llamado createAndInitializeArray() que reciba por parámetro un número entero
	   y devuelva un array de tipo int. En el cuerpo de este métod. se creará el array y se inicializará
	   con tantos elementos como indique el parámetro (usar un for). */
	public static int[] createAndInitializeArray(int num){
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = i+1;
		}
		return array;
	}

	/* Crear un métod. llamado showInlineArray() que reciba por parámetro un array de tipo entero y
	 dentro del cuerpo lo recorra elemento a elemento y los muestre por pantalla. El formato de
	 presentación debe ser "secuencial", así: numero1 numero2 numero3 ... numeroN */
	public static void showInlineArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			if (i != (array.length-1)){
			System.out.print(array[i] + " ");
		} else {
				System.out.print(array[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] array = createAndInitializeArray(Utils.integer("Write the array size: "));
		showInlineArray(array);
	}
}
