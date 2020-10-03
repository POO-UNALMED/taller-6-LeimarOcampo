package vehiculos;

public class Camioneta extends Vehiculo {
	boolean volco;
	public static int camionetas = 0;
	public Camioneta() {
		this.velocidadMaxima = 90;
		this.traccion = "4X4";
		cantidadVehiculos++;
		camionetas++;
	}
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		this();
		this.placa = placa;
		this.puertas = puertas;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.volco = volco;
		Paises.add(fabricante.getPais());
		Fabricantes.add(fabricante);
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	public boolean isVolco() {
		return this.volco;
	}
	public static int getCamionetas() {
		return camionetas;
	}
}
