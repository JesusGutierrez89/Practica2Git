package ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sesion2 {
	public static void main(String[] args) {
		String[] listaNombre = obtenerLineas();
		
		System.out.println("Listado de nombres");
		for(int i = 0; i<listaNombre.length; i++) {
			System.out.println(listaNombre[i]);
		}

	}

	public static String[] obtenerLineas() {
		ArrayList<String> lista = new ArrayList<String>();
		try {
			File myObj = new File(".\\assets\\nombres.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String linea = myReader.nextLine();
				lista.add(linea);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		String[] array = new String[lista.size()];
		for(int i = 0; i<array.length; i++) {
			array[i]= lista.get(i);
		}
		return array;
		
	}
}
