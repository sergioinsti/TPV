import java.util.*;

public class Venta {
	private ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();
	private double importe;
	public Venta(Articulo artB) {
		importe = 0;
		anyadir(artB);
	}
	public double getImporte() {
		return importe;
	}
	public void imprimirTicket() {
		
	}
	public void anyadir(Articulo artA) {
		listaArticulos.add(artA);
		importe = importe + artA.getPrecioUnidad();
	}
}
