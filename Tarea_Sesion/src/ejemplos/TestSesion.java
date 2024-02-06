package ejemplos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class TestSesion {
	 //Comprobacion Usuario correcto y password correcto
	@Test
	    public void testCorrecto() {
	        Sesion sesion = new Sesion();
	        assertTrue(sesion.login("pepe", "654321"));
	    }
	//Comprobacion Usuario incorrecto y password corrector
	    @Test
	    public void testUsuarioInc() {
	        Sesion sesion = new Sesion();
	        assertFalse(sesion.login("Manolo", "987654321"));
	    }
	//Comprobacion Usuario correcto y password incorrecto
	    @Test
	    public void testPasswInc() {
	        Sesion sesion = new Sesion();
	        assertFalse(sesion.login("dmunuera", "123456789"));
	    }
	//Comprobacion de usuario y password incorrectos
	    @Test
	    public void testTodoInc() {
	        Sesion sesion = new Sesion();
	        assertFalse(sesion.login("Ramon", "987654"));
	    }
}
