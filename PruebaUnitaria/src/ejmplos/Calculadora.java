package ejmplos;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }
    
    //Metodo par que obtiene un entero y devuelve un boolean
    //Metodo impar que obtiene un entero y devuelve un impar
    
    public boolean par(int a) {
    	
    	if (a%2==0) {
    		System.out.println("El numero es par");
    		return true;
    	}
    	return false;
   
    }
    public boolean impar(int a) {	
        if (a%2!=0) {
        	System.out.println("El numero es impar");
        	return true;
        }
        	return false;
    }	
}