package vehiculos;

public class Automovil extends Vehiculo {
	int puestos;
	public static int automoviles = 0;
	public Automovil() {
		this.puertas = 4;
		this.velocidadMaxima = 100;
		this.traccion = "FWD";
		cantidadVehiculos++;
		automoviles++;
	}
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		this();
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.puestos = puestos;
		Paises.add(fabricante.getPais());
		Fabricantes.add(fabricante);
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public int getPuestos() {
		return this.puestos;
	}
	public static void setAutomoviles(int autos) {
		automoviles = autos;
	}
	public static int getAutomoviles() {
		return automoviles;
	}
}
