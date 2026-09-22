import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Mago extends Personaje {
	// ATRIBUTOS 
	ArrayList <Hechizo> hechizos = new ArrayList<>();
	
	
	// CONSTRUCTOR 
	
	public Mago (String nombre) {
		super (nombre);
		fuerza = AsignarFuerza(); 
		inteligencia = AsignarInteligencia(); 
	}
	
	
	// METODOS
	
	@Override
	public int CalcularPoder() {
		int resultado = 0;
		resultado = fuerza * inteligencia + vida;   
		return resultado; 
	}
	
	private int AsignarFuerza() {
		int resultado = 0; 
		Random ran = new Random(); 
		resultado = ran.nextInt(20) + 1; 
		return resultado; 
	}
	 
	private int AsignarInteligencia() {
		int resultado = 0; 
		Random ran = new Random(); 
		resultado = ran.nextInt(); 
		do  {
			resultado = ran.nextInt();
		} while (resultado > max_inteligencia); 
		return resultado; 
	}
	
	public String AprenderHechizo(Hechizo hechizo) {
				hechizos.add(hechizo); 
		return "Has aprendido un hechizo";
	}
		
	public String LanzaHechizo(Personaje victima, Hechizo hechizo) {
		int vida = victima.getVida(); 
		vida = vida - hechizo.getPotencia(); 
		victima.setVida(vida);
		Iterator<Hechizo> it = hechizos.iterator(); 
		while (it.hasNext()) {
			if (it.next().equals(hechizo)) {
				it.remove();
			}
		}
		
		return nombre + "ha lanzado un hechizo a " + victima.getNombre() + "y pierde " + hechizo.getPotencia() + "de vida"; 
	}


	@Override
	public String toString() {
		return "Mago [hechizos=" + hechizos + ", nombre=" + nombre + ", fuerza=" + fuerza + ", inteligencia="
				+ inteligencia + ", vida=" + vida + ", Poder" + CalcularPoder() + "]";
	}
	
	//GETTERS Y SETTER 
	
	
}
