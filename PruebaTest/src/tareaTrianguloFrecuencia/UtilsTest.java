package tareaTrianguloFrecuencia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class UtilsTest {
	
	@Test
	//compruebo que los resultados sean TRUE
    public void testEsTriangulo() {
    	System.out.println("Es un triangulo");
        boolean resultado = Utils.esTriangulo(2, 3, 4);
        assertTrue(resultado);
    }
	@Test
	//compruebo que los resultados sean TRUE con Equals
    public void testEsTriangulo1() {
    	System.out.println("Es un triangulo");
        boolean resultado = Utils.esTriangulo(2, 3, 4);
        assertEquals(true, resultado);
    }
	@Test
	//compruebo que los resultados sean false 
    public void testEsTriangulo2() {
    	System.out.println("Es un triangulo");
        boolean resultado = Utils.esTriangulo(0, 3, 4);
        assertEquals(false, resultado);
    }
	@Test
	//compruebo que los resultados sean FALSE
    public void testEsTriangulo3() {
    	System.out.println("Es un triangulo");
        boolean resultado = Utils.esTriangulo(2, 0, 4);
        assertFalse(resultado);
	}  
	@Test
	//compruebo que los valores dados sean un equilatero
    public void testTipoTriangulo() {
		System.out.println("Es un triangulo EQUILATERO");
		assertEquals("EQUILATERO", Utils.tipoTriangulo(3, 3, 3));
	} 
	//compruebo que los valores dados sean un isosceles
	@Test
	public void testTipoTriangulo1() {
		System.out.println("Es un triangulo ISOSCELES");
		assertEquals("ISOSCELES", Utils.tipoTriangulo(3, 3, 4));
	}
	//compruebo que los valores dados sean un escaleno
	@Test
	public void testTipoTriangulo2() {
		System.out.println("Es un triangulo ESCALENO");
		assertEquals("ESCALENO", Utils.tipoTriangulo(3, 4, 6));
	}
	//compruebo que los valores dados a un triangulo escaleno sea incorrecto
	@Test
	public void testTipoTriangulo3() {
		System.out.println("Es un triangulo ESCALENO");
		assertNotEquals("ESCALENO", Utils.tipoTriangulo(3, 3, 6));
	}
	//compruebo triangulos erroneos
	@Test
	public void testTipoTriangulo4() {
		System.out.println("No es un tipo de triangulo");
		assertEquals("ERROR", Utils.tipoTriangulo(0, -1, 6));
	}
	//compruebo triangulos erroneos
	@Test
	public void testTipoTriangulo5() {
		System.out.println("No es un tipo de triangulo");
		assertEquals("ERROR", Utils.tipoTriangulo(1, 1, 2));
	}
	@Test
    public void testMasFrecuente() {
        //Array con un único elemento
        int[] array = {5};
        System.out.println("un solo elemento en el array");
        assertEquals(5, Utils.masFrecuente(array));
	}
	@Test
	public void testMasFrecuente1() {
        // Array con varios numeros
        int[] array = {1, 3, 4, 2, 2, 1, 2, 4, 1, 1, 2, 2, 2};
        System.out.println("Varios numeros en el array");
        assertEquals(2, Utils.masFrecuente(array));
	}
	@Test
	public void testMasFrecuente2() {
        // Array es 0
        int[] array = {0};
        System.out.println("El elemento es 0");
        assertEquals(0, Utils.masFrecuente(array));
	}
	@Test
	public void testMasFrecuente3() {
        // Array con varios numeros negativos
        int[] array = {-1, -2, -1, -3, 4, 6, 8};
        System.out.println("Varios numeros negativos en el array");
        assertEquals(-1, Utils.masFrecuente(array));
	}
	@Test
	public void testMasFrecuente4() {
        // Array con un valor que no corresponde
        int[] array = {1,2,3,4,5,6,6,6,7,3,4};
        System.out.println("El valor dado no es el correcto");
        assertNotEquals(3, Utils.masFrecuente(array));
	}
	@Test
	public void buscarEntero() {
        // Buscar un valor en el array
		int[] array = {4, 7, 2, 11, 5, 9};
		System.out.println("Buscar un valor dado");
        assertEquals(4, Utils.buscarEntero(array, 5));
	}
	@Test
	public void buscarEntero1() {
        // Buscar un valor en el array que no esta
		int[] array = {2, 5, 6, 7, 2, 4, 9};
		System.out.println("Buscar un valor que no esta");
		assertEquals(-1, Utils.buscarEntero(array, 8));
	}
	@Test
	public void buscarEntero2() {
        // Buscar un valor en el array en la primera posicion
		int[] array = {2, 5, 6, 7, 2, 4, 9};
		System.out.println("Buscar un valor en la primera posicion");
		assertEquals(0, Utils.buscarEntero(array, 2));
	}
	@Test
	public void buscarEntero3() {
        // Buscar un valor en el array en la ultima posicion 
		int[] array = {2, 5, 6, 7, 2, 4, 9};
		System.out.println("Buscar un valor en la primera ultima posicion");
		assertEquals(6, Utils.buscarEntero(array, 9));
	}
	@Test
	public void buscarEntero4() {
        // Array vacio
		int[] array = {};
		System.out.println("Array vacio");
		assertEquals(-1, Utils.buscarEntero(array, 5));
	}
	@Test
	public void buscarEntero5() {
        // Que el resultado no sea el esperado
		int[] array = {2, 5, 6, 7, 2, 4, 9};
		System.out.println("El numero no es el correcto");
		assertNotEquals(3, Utils.buscarEntero(array, 4));
	}
	@Test
	public void buscarEntero6() {
        // Dar una posicion incorrecta con un valor no existente
		int[] array = {2, 5, 6, 7, 2, 4, 9};
		System.out.println("La posicion y el numero no existen");
		assertNotEquals(12, Utils.buscarEntero(array, 13));
	}
}