
public class Hechizo {
	//ATRIBUTOS 
	private String nombre; 
	private int potencia; 

	//CONSTRUCTORES
	
	public Hechizo () {
		nombre = "fuego"; 
		potencia = 11; 
	}

	
	//METODOS
	
	//GETTERS Y SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Hechizo [nombre=" + nombre + ", potencia=" + potencia + "]";
	}
	
}
