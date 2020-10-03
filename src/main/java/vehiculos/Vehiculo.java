package vehiculos;
import java.util.*;
public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	protected static int cantidadVehiculos = 0;
	public static Vector <Pais> Paises = new Vector<Pais>();
	public static Vector <Fabricante> Fabricantes = new Vector<Fabricante>();
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos++;
		Paises.add(fabricante.getPais());
		Fabricantes.add(fabricante);
	}
	public Vehiculo() {
	}
	public String getPlaca() {
        return (this.placa);
    }
    public void setPuestos(String placaNueva) {
        this.placa = placaNueva;
    }
    public int getPuertas() {
        return (this.puertas);
    }
    public void setPuertas(int puertaNueva) {

        this.puertas = puertaNueva;
    }
    public int getVelocidadMaxima() {
        return (this.velocidadMaxima);
    }
    public void setVelocidadMaxima(int velocidadNueva) {
        this.velocidadMaxima = velocidadNueva;
    }
    public int getPrecio() {
        return (this.precio);
    }
    public void setPrecio(int precioNuevo) {
        this.precio = precioNuevo;
    }
    public int getPeso() {
        return (this.peso);
    }
    public void setPeso(int pesoNuevo) {
        this.peso = pesoNuevo;
    }

    public String getNombre() {
        return (this.nombre);
    }
    public void setNombre(String nombreNuevo) {
        this.nombre = nombreNuevo;
    }
    public String getTraccion() {
        return (this.traccion);
    }
    public void setTraccion(String traccionNueva) {
        this.traccion = traccionNueva;
    }
    public void setFabricante(Fabricante fabricante) {
    	this.fabricante = fabricante;
    }
    public Fabricante getFabricante() {
    	return this.fabricante;
    }
    public static int getCantidadVehiculos(){
        return (cantidadVehiculos);
    }
    public static void setCantidadVehiculos(int nuevaCantidad) {
        cantidadVehiculos = nuevaCantidad;
    }
    public String vehiculosPorTipo() {
    	return ("Automoviles: " + Automovil.getAutomoviles() + "\n" + "Camionetas: " + Camioneta.getCamionetas() + "\n" + "Camiones: " + Camion.getCamionetas());
    }
    
}
