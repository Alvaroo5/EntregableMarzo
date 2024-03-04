package u6u7.entregable;

public class Manager {
	protected String nombre;
	protected int telefono;
	
	Manager(String nombre, int telefono){ //Constructor de Manager
		this.nombre=nombre;
		this.telefono=telefono;
	}
	
	//Metodos Getters
	public String getNombre() {
		return nombre;
	}

	public int getTelefono() {
		return telefono;
	}
}
