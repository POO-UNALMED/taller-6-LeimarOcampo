package vehiculos;

public class Camion extends Vehiculo{
	int ejes;
	public static int camionetas;
	public Camion() {
		this.puertas = 2;
		this.velocidadMaxima = 80;
		this.traccion = "4X2";
		cantidadVehiculos++;
		camionetas++;
	}
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		this();
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.ejes = ejes;
		Paises.add(fabricante.getPais());
		Fabricantes.add(fabricante);
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public int getEjes() {
		return this.ejes;
	}
	public static int getCamionetas() {
		return camionetas;
	}
}
