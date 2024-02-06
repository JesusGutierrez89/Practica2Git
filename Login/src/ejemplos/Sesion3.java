package ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sesion3 {
	public static void main(String[] args) {
		Articulo[] articulos = obtenerArticulo();
		
		System.out.print("listado de articulo \n-----------------------");
		for(int i =0 ; i<articulos.length; i++) {
			System.out.println("Nombre del articulo es: "+articulos[i].getNombre());
			System.out.println("Numero de articulos: "+articulos[i].getPrecio()+" €");
			System.out.println("Descripcion del articulo es:  "+articulos[i].getDescripcion());
		}
	}

	

	public static Articulo[] obtenerArticulo() {
		ArrayList<Articulo> lista = new ArrayList<Articulo>();
		try {
			File myObj = new File(".\\assets\\tienda.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String linea = myReader.nextLine();
				String [] campos = linea.split("@");
				Articulo art = new Articulo();
				art.setNombre(campos[0]);
				art.setPrecio(Double.parseDouble(campos[1]));
				art.setDescripcion(campos[2]);
				lista.add(art);
				//lista.add(linea);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		Articulo[] array = new Articulo[lista.size()];
		for(int i = 0; i<array.length; i++) {
			array[i]= lista.get(i);
		}
		return array;
		
	}
}
