package ejmplos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	public Calculadora calculadora;
	
	@Before
	public void preparacion() {
		this.calculadora = new Calculadora();
	}
    @Test
    public void testSumar() {
    	System.out.println("testSumar");
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testRestar() {
    	System.out.println("testRestar");
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
    }
    @Test
    public void testPar() {
    	System.out.println("testPar");
    	Calculadora calculadora = new Calculadora();
        boolean resultado = calculadora.par(4);
        assertTrue(resultado);
        boolean resultado2 = calculadora.par(5);
        assertFalse(resultado2);
    }
    @Test
    public void testImpar() {
    	System.out.println("testImpar");
    	Calculadora calculadora = new Calculadora();
        boolean resultado = calculadora.impar(5);
        assertTrue(resultado);
        boolean resultado2 = calculadora.impar(6);
        assertFalse(resultado2);
    }
}