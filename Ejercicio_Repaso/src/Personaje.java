
public abstract class Personaje implements Rol {
	// ATRIBUTOS
	protected String nombre;
	protected int fuerza, inteligencia,max_vida,vida, max_fuerza, max_inteligencia;
	protected Raza raza; 

	//CONSTRUCTORES
	
	public Personaje(String nombre) {
		this.nombre = nombre; 
		max_vida = 500;
		max_inteligencia = 25;
		max_fuerza = 20; 
	}

	
	//METODOS 
	
	
	
	//GETTERS Y SETTERS 
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getMax_vida() {
		return max_vida;
	}

	public void setMax_vida(int max_vida) {
		this.max_vida = max_vida;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}


	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", fuerza=" + fuerza + ", inteligencia=" + inteligencia + ", max_vida="
				+ max_vida + ", vida=" + vida + ", raza=" + raza + "]";
	}
	
	
	
}
