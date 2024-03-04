package u6u7.entregable;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u6u7.entregable.Artista.EstiloMusical;

public class Festival {
	protected String nombreEvento;
	protected int codPostal;
	protected Map<EstiloMusical, Set<Artista>> mapArtistas;
	public static int totalInscritos;
	
	Festival(String nombreEvento, int codPostal){ //Constructor de Festival
		this.nombreEvento=nombreEvento;
		this.codPostal=codPostal;
		this.mapArtistas = new HashMap<>();
		this.mapArtistas.put(EstiloMusical.POP, new HashSet<>());
		this.mapArtistas.put(EstiloMusical.INDIE, new HashSet<>());
		this.mapArtistas.put(EstiloMusical.ROCK, new HashSet<>());
	}
	
	public void inscribeArtista(EstiloMusical estiloMusical, Artista artista) { //Metodo para inscribir a un artista
		
		this.mapArtistas.get(estiloMusical).add(artista);
		totalInscritos++;

	}
	
	public String cuantosInscritos() { //Metodo para saber cuantos estan inscritos
		return "Hay un total de "+totalInscritos+" inscritos";
	}
	
	public void artistasByCache(EstiloMusical estiloMusical) {
		Set<Artista> nueva = mapArtistas.get(estiloMusical);
		List<Artista> ListaOrden = new ArrayList<>(); //Array para ordenar
		Collections.sort(ListaOrden, new Comparador); //Ordenacion del array tras haber creado la clase comparador pero me da un error
		System.out.println(ListaOrden); //Imprimimos el nuevo array de la lista ordenada
	}
	
	public void artistasInscritos() {
		
	}
	
	public void cargarArtistas() throws ClassNotFoundException { //Metodo para cargar el fichero
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("artistas.dat"))) {
           mapArtistas = (Map<EstiloMusical, Set<Artista>>) ois.readObject();
           System.out.println("Cargados correctamente a artistas.dat");
        } catch (IOException e) {
            System.out.println("Error al cargarlos a artistas.dat");
        }
	}
	
	public void guardarArtistas() { //Metodo para guardar el fichero
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("artistas.dat"))) {
            oos.writeObject(mapArtistas);
            System.out.println("Guardados correctamente en el archivo artista.dat");
        } catch (IOException e) {
            System.out.println("Error al guardar artistas.dat");
        }
	}
}
