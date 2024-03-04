package u6u7.entregable;

public class Musico {
	protected String nombreArtistico;
	protected int edad;
	
	Musico(String nombreArtistico, int edad){ //Constructor de Musico 
		this.nombreArtistico=nombreArtistico;
		this.edad=edad;
	}
	
	//Metodos Getters
	public String getNombreArtistico() {
		return nombreArtistico;
	}

	public int getEdad() {
		return edad;
	}
}
