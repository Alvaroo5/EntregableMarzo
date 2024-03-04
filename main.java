package u6u7.entregable;

import java.util.Scanner;

import u6u7.entregable.Artista.EstiloMusical;

public class main {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		//Creamos los objetos
		Festival festival = new Festival("AlAndalus", 41800);
		
		Musico musico1 = new Musico("Andres", 30);
		Musico musico2 = new Musico("Manolo", 31);
		Musico musico3 = new Musico("Juan", 32);
		Musico musico4 = new Musico("Isco", 33);
		
		Manager manager1 = new Manager("Pellegrini", 345678098);
		Manager manager2 = new Manager("Guardiola", 234543654);
		
		Artista art1 = new Artista("flamenco", EstiloMusical.INDIE, 100, manager1);
		art1.addMusico(musico1);//Asociamos dos musicos al artista1
		art1.addMusico(musico2);
		
		Artista art2 = new Artista("bachata", EstiloMusical.INDIE, 200, manager2);
		
		Artista art3 = new Artista("flamenco", EstiloMusical.POP, 300, manager1);
		art3.addMusico(musico3); //Asociamos dos musicos al artista3
		art3.addMusico(musico4);
		
		Artista art4 = new Artista("flamenco", EstiloMusical.POP, 400, manager2);
		
		//Inscribimos cada artista
		festival.inscribeArtista(EstiloMusical.INDIE, art1);
		festival.inscribeArtista(EstiloMusical.INDIE, art2);
		festival.inscribeArtista(EstiloMusical.POP, art3);
		festival.inscribeArtista(EstiloMusical.POP, art4);
		
		//Llamamos al metodo que nos dice cuantos hay inscritos
		festival.cuantosInscritos();
		
		festival.artistasByCache();
		
		//Guardamos y cargamos
		festival.guardarArtistas();
		try {
			festival.cargarArtistas();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
