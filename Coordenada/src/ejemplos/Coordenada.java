package ejemplos;

public class Coordenada {
	private double x;
	private double y;

	
	//constructor
	public Coordenada(double x, double y) {
		super();
		this.x = x;
		this.y = y;
		
	}


	//getter y setter
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	//Distancia al centro
	public double distanciaAlcentro(double x, double y) {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}
	public double distanciaEntrePuntos(Coordenada b) {
		return Math.sqrt(Math.pow(b.getX() - this.getX(), 2) + Math.pow(b.getY() - this.getY(), 2));
	}
	
	
}
