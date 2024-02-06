package ejemplos;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

public class CoordenadasTest {
	Coordenada c1;
	Coordenada c2;
	Coordenada c3;
	
	@Before
	public void inizializar() {
		c1 = new Coordenada(2,5);
		c2 = new Coordenada(-5.6,1.8);
		c3 = new Coordenada(9.3,-5.2);
		
	}
	@Test
	public void testGetX() {
		double res1 = c1.getX();
		assertEquals(2, res1, 0.001);
		double res2 = c2.getX();
		assertEquals(-5.6, res2, 0.001);
		double res3 = c3.getX();
		assertEquals(9.3, res3, 0.001);
	}
	
	@Test
	public void testGetY() {
		double res1 = c1.getY();
		assertEquals(5, res1, 0.001);
		double res2 = c2.getY();
		assertEquals(1.8, res2, 0.001);
		double res3 = c3.getY();
		assertEquals(-5.2, res3, 0.001);
	}
	// Metodo distancia al centro
	@Test
	public void testDistanciaAlcentro() {
		double res1 = c1.distanciaAlcentro(2, 5);
		assertEquals(5.3851, res1, 0.001);
		double res2 = c2.distanciaAlcentro(-5.6, 1.8);
		assertEquals(5.8821, res2, 0.001);
		double res3 = c3.distanciaAlcentro(9.3,-5.2);
		assertEquals(10.655, res3, 0.001);
	}
	@Test
	public void testDistanciaEntrePuntos() {
		double res1 = c1.distanciaEntrePuntos(c2);
		assertEquals(8.2462, res1, 0.001);
		double res2 = c2.distanciaEntrePuntos(c3);
		assertEquals(16.4623, res2, 0.001);
		double res3 = c3.distanciaEntrePuntos(c1);
		assertEquals(12.5431, res3, 0.001);
	}
	
}
