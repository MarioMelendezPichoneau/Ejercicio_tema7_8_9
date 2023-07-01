package Ejercicio_tema7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.io.*;

public class Tema_7_8_9 {
	public static void main(String[] args) {
		
		
		//Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
		 
		System.out.println(reverse("hola mundo"));
		
		
		 // 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
		
		String[] arrUnidimencional = new String[3];
		arrUnidimencional[0]="Hola  ";
		arrUnidimencional[1]="mundo ";
		arrUnidimencional[2]="!";
		
		for (String arr : arrUnidimencional) {
			System.out.println(arr);
		}
		
		// 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
		
		int[][] arrEntero = new int[4][4];
		for(int i=0; i <arrEntero.length; i++) {
			for(int j=0; j <arrEntero[i].length; j++) {
				System.out.println("[" + i + "][" + j + "] = " + arrEntero[i][j]);
			}
		}
		
		
		//3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
		
		Vector<String> vec = new Vector<String>();
		vec.add("elemento 1");
		vec.add("elemento 2");
		vec.add("elemento 3");
		vec.add("elemento 4");
		vec.add("elemento 5");
		
		vec.remove(1);
		vec.remove(2);
		for(int i=0; i <vec.size();i++) {
			System.out.println(vec.get(i));
		}
		for (String s : vec) {
			System.out.println(s);
		}
		
		/* 4.
		 * 
		 * El problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo 
		 * es que el Vector tendría que redimensionarse muchas veces durante la ejecución del programa. Cada vez que el Vector se 
		 * redimensiona, se crea un nuevo array interno y se copian los elementos del array anterior al nuevo array. Esto puede ser 
		 * muy costoso en términos de tiempo de ejecución y uso de memoria.
		 * Para evitar este problema, es mejor especificar la capacidad inicial del Vector al crearlo. De esta manera, el Vector 
		 * tendrá suficiente espacio para todos los elementos que se agregarán y no tendrá que redimensionarse durante la ejecución 
		 * del programa.
		 */
		
		/*
		 * 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente 
		 * el valor de cada elemento.
		 */
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Elemento 1");
		arrList.add("Elemento 2");
		arrList.add("Elemento 3");
		arrList.add("Elemento 4");
		
		
		LinkedList<String> linkedList = new LinkedList<String>(arrList);
		
		for (String string : arrList) {
			System.out.println(string);
		}
		for (String string : linkedList) {
			System.out.println(string);
		}
		
		/*
		 *6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, 
		 * recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, 
		 * puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
		 */
		
		ArrayList<Integer> arrlistEnteros = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			arrlistEnteros.add(i);
		}
		
		for(int i=0; i<arrlistEnteros.size(); i++) {
			if(arrlistEnteros.get(i)%2==0) {
				arrlistEnteros.remove(i);
				i--;
			}
		}
		
		for (int i = 0; i < arrlistEnteros.size(); i++) {
		    System.out.println(arrlistEnteros.get(i));
		}
		
		/*
		 * 7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException 
		 * que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje 
		 * "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
		 */
		
		try {
			DividePorCero();
		}catch (ArithmeticException e) {
			System.out.println("Esto no puede hacerse");
		}finally {
			System.out.println("Demo de codigo");
		}
		
		/*
		 * 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la 
		 * función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
		 */
		try {
			CopiarArchivo("archivo1.txt", "archivo2.txt");
		}catch (IOException e) {
			
			System.out.println("error: " + e.getMessage());
		}
		
		
		 
	}
	
	
	
	
	
	
	public static String reverse(String texto) {
	    StringBuilder resultado = new StringBuilder();
	    for (int i = texto.length() - 1; i >= 0; i--) {
	        resultado.append(texto.charAt(i));
	    }
	    return resultado.toString();
	}
	
	public static void DividePorCero() throws ArithmeticException {
	    int x = 1 / 0;
	} 
	
	public static void CopiarArchivo(String fileIn, String fileOut) throws IOException {
		
		 InputStream in = new FileInputStream(fileIn);
		 byte[] datos = in.readAllBytes();
		 in.close();
		 PrintStream out = new PrintStream(new FileOutputStream(fileOut));
		 out.write(datos);
		 out.close();

	}

}
 

