package Ejercicio_tema7_8_9;

import java.io.InputStreamReader;
import java.io.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Punto9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
	            // Crear un BufferedReader para leer la entrada del usuario
	            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	            
	            // Crear un HashMap para almacenar pares clave-valor
	            HashMap<String, String> hashMap = new HashMap<>();
	            
	            // Crear una lista enlazada (LinkedList) para almacenar elementos
	            List<String> linkedList = new LinkedList<>();
	            
	            // Crear un ArrayList para almacenar elementos
	            List<String> arrayList = new ArrayList<>();
	            
	            // Leer una cadena de texto del usuario
	            System.out.print("Ingrese una cadena de texto: ");
	            String input = reader.readLine();
	            
	            // Agregar la cadena de texto al HashMap utilizando una clave predefinida
	            hashMap.put("clave", input);
	            
	            // Agregar la cadena de texto a la lista enlazada
	            linkedList.add(input);
	            
	            // Agregar la cadena de texto al ArrayList
	            arrayList.add(input);
	            
	            // Imprimir el contenido del HashMap
	            System.out.println("Contenido del HashMap:");
	            for (String key : hashMap.keySet()) {
	                String value = hashMap.get(key);
	                System.out.println("Clave: " + key + ", Valor: " + value);
	            }
	            
	            // Imprimir el contenido de la lista enlazada
	            System.out.println("Contenido de la lista enlazada:");
	            for (String item : linkedList) {
	                System.out.println(item);
	            }
	            
	            // Imprimir el contenido del ArrayList
	            System.out.println("Contenido del ArrayList:");
	            for (String item : arrayList) {
	                System.out.println(item);
	            }
	        } catch (IOException e) {
	            System.err.println("Error de entrada/salida: " + e.getMessage());
	        }

	}

}
