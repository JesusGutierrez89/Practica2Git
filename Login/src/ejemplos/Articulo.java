package ejemplos;

public class Articulo {
	private String nombre;
	private double precio;
	private String descripcion;
	
	public Articulo() {
		
	}
	public Articulo(String nombre, double precio, String descripcion) {
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setDescripcion(descripcion);
	}
	//Getter y setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
