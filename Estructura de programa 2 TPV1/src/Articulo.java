
public class Articulo {
	private String descripcion;
	private double precioUnidad;
	public Articulo(String descripcion, double precioUnidad) {
		super();
		this.descripcion = descripcion;
		this.precioUnidad = precioUnidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public double getPrecioUnidad() {
		return precioUnidad;
	}
}
