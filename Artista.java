package u6u7.entregable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Artista implements Comparable<Artista>{//Implementamos el comparable
	protected String nombreArtistico;
	protected int cache;
	protected enum EstiloMusical{POP, ROCK, INDIE};
	protected EstiloMusical estiloMusical;
	protected Manager manager;
	protected Set<Musico> musicos;
	
	Artista(String nombreArtistico, EstiloMusical estiloMusical, int cache, Manager manager){ //Constructor de artista
		this.nombreArtistico=nombreArtistico;
		this.estiloMusical=estiloMusical;
		this.cache=cache;
		this.manager=manager;
		this.musicos=new HashSet<Musico>();
	}
	
	public void addMusico(Musico musico) { //Metodo para añadir musicos
		musicos.add(musico);
	}
	
	public void delMusico(Musico musico) { //Metodo para eliminar musicos
		musicos.remove(musico);
	}
	
	public void imprimeMusico(Musico musico) { //Metodo para imprimir musicos
		for(Musico musicos : musicos) { //Pongo 'musicos' delante de ':' porque al poner 'musico' me da error
			System.out.println(musico.getNombreArtistico());
		}
	}
	
	//Metodos Getters
	public String getNombreArtistico() {
		return nombreArtistico;
	}

	public double getCache() {
		return cache;
	}

	public EstiloMusical getEstiloMusical() {
		return estiloMusical;
	}

	public Manager getManager() {
		return manager;
	}

	public Set<Musico> getMusicos() {
		return musicos;
	}

	@Override
	public int compareTo(Artista o) {
		// TODO Auto-generated method stub
		return this.cache = o.cache;
	}
	
}
