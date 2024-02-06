package ejemplos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fichero {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("Nuevo Alumno: ");
			String texto = teclado.nextLine().trim();

			boolean resultado = insertarAlumno(texto);

			if (resultado) {
				System.out.println("Alumno insertado con exito");
			} else {
				System.out.println("Ha ocurrido un error");
			}
		}
	}

	public static boolean insertarAlumno(String texto) {
		try {
			FileWriter myWriter = new FileWriter(".\\assets\\nombres.txt", true);
			myWriter.write("\n" + texto);
			myWriter.close();

		} catch (IOException e) {

			return false;
		}

		return true;
	}

}
