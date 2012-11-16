package claseAux2;

public class Jugador {

	public String nombre;
	public int numero;
	
	public int temperamento;
	public int potencia;
	public int precision;
	
	public Jugador() {
		this(null,0);
	}
	
	public Jugador(String nombre, int numero){
		this.nombre = nombre;
		this.numero = numero;
	}
	
	
	public void darPase(int numJugador){
		
	}
	public boolean tiroArco(){
		return false;
	}
	public int patearPenal() {
		double random = Math.random();
		
		int direccion = 2;
		if(random<0.33&&random>0)
			direccion = 0;
		
		else if(random>0.33&&random<0.66)
			direccion = 1;
		
		return direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getNumero() {
		return numero;
	}
	public int getTemperamento() {
		return temperamento;
	}
	public int getPotencia() {
		return potencia;
	}
	public int getPrecision() {
		return precision;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setTemperamento(int temperamento) {
		this.temperamento = temperamento;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public void setPrecision(int precision) {
		this.precision = precision;
	}
	
	
}
