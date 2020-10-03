package vehiculos;
import java.util.*;
public class Fabricante {
	String nombre;
	Pais pais;
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Pais getPais() {
		return this.pais;
	}
	public static Fabricante fabricaMayorVentas() {
		Fabricante mayorfabricante = null;
		int mayorveces = 0;
		for(int i = 0; i < Vehiculo.Fabricantes.size(); i++) {
			Fabricante fabricante = Vehiculo.Fabricantes.get(i);
			int veces = 0;
			for(int j = 0; j < Vehiculo.Fabricantes.size(); j++) {
				if(Vehiculo.Fabricantes.get(i) == Vehiculo.Fabricantes.get(j)) {
					veces++;
				}
				if(veces > mayorveces) {
					mayorveces = veces;
					mayorfabricante = fabricante;
				}
			}
		}
		return mayorfabricante;
	}
}
