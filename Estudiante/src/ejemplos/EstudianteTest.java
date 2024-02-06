package ejemplos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EstudianteTest {
		Estudiante alu1;
		Estudiante alu2;
		Estudiante alu3;
		
		@Before
		public void crearEstudiantes() {
			alu1 = new Estudiante("Pepe", 21, 5.6);
			alu2 = new Estudiante("Juan", 18, 8.7);
			alu3 = new Estudiante("Manolo", 15, 4);
			
		}
		@Test
		public void testGetNombre() {
			String res1 = alu1.getNombre();
			assertEquals("Pepe", res1);
			String res2 = alu2.getNombre();
			assertEquals("Juan", res2);
			String res3 = alu3.getNombre();
			assertEquals("Manolo", res3);
		}
		@Test
		public void testGetEdad() {
			int res1 = alu1.getEdad();
			assertEquals(21, res1);
			int res2 = alu2.getEdad();
			assertEquals(18, res2);
			int res3 = alu3.getEdad();
			assertEquals(15, res3);
		}
		@Test
		public void testGetNota() {
			double res1 = alu1.getNota();
			assertEquals(5.6, res1,0.001);
			double res2 = alu2.getNota();
			assertEquals(8.7, res2, 0.001);
			double res3 = alu3.getNota();
			assertEquals(4, res3,0.001);
		}
		@Test
		public void testObtenerEstadoAcademico() {
			String res1 = alu1.obtenerEstadoAcademico();
			assertEquals("Aprobado", res1);
			String res2 = alu2.obtenerEstadoAcademico();
			assertEquals("Notable", res2);
			String res3 = alu3.obtenerEstadoAcademico();
			assertEquals( "Suspenso",res3);
		}
		
}
