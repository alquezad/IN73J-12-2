package claseAux2;

public class Arquero extends Jugador {

	public Arquero(String nombre, int numero){
		super(nombre, numero);
	}
	
	public int atajarPenal(){
		double random = Math.random();
		
		int direccion = 2;
		if(random<0.33&&random>0)
			direccion = 0;
		
		else if(random>0.33&&random<0.66)
			direccion = 1;
		
		return direccion;
	}
}
