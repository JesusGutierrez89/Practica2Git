package tareaTrianguloFrecuencia;

public class Utils {
	
	public static boolean esTriangulo(double a, double b, double c) {
		if ((a>0 && b>0 && c>0)&&(a + b > c) && (a + c > b) && (b + c > a)) {
			return true;
		}
		return false;
		
	}
	public static String tipoTriangulo(double a, double b, double c) {
        if (esTriangulo(a, b, c)) {
            if (a == b && b == c) {
                return "EQUILATERO";
            } else if (a == b || a == c || b == c) {
                return "ISOSCELES";
            } else {
                return "ESCALENO";
            }
        } else {
            return "ERROR";
        }
    }
	public static int masFrecuente(int[] array) {
        if (array.length == 0) {
            System.out.println("El array está vacío");
        }

        int numerosMasFrecuente = array[0];
        int maxFrecuencia = 1;

        for (int i = 0; i < array.length - 1; i++) {
            int contador = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    contador++;
                }
            }

            if (contador > maxFrecuencia) {
                maxFrecuencia = contador;
                numerosMasFrecuente = array[i];
            }
        }

        return numerosMasFrecuente;
    }
	public static int buscarEntero(int[] array, int valorBusc) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorBusc) {
                return i; 
            }
        }
        return -1; 
    }
	
}