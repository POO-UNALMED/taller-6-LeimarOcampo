package vehiculos;
import java.util.*;
public class Pais {
	String nombre;
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public static Pais paisMasVendedor() {
		Pais mayorpais = null;
		int mayorveces = 0;
		for(int i = 0; i < Vehiculo.Paises.size(); i++) {
			Pais pais = Vehiculo.Paises.get(i);
			int veces = 0;
			for(int j = 0; j < Vehiculo.Paises.size(); j++) {
				if(Vehiculo.Paises.get(i) == Vehiculo.Paises.get(j)) {
					veces++;
				}
				if(veces > mayorveces) {
					mayorveces = veces;
					mayorpais = pais;
				}
			}
		}
		return mayorpais;
	}
}
