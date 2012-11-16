package claseAux2;

public class ElementosEsencialesJava {

	public static void main(String[] args) {
		
		//ejercicio1("Messi");
		//ejercicio1("Ronaldo");
		ejercicio2();
	}

	public static void ejercicio1(String palabra){
	
		if(palabra.equals("Messi")){
			System.out.println("Wow es Messi!!!");
		}else{
			System.out.println("Puff...no era Messi");
			
		}
	}
	
	public static void ejercicio2(){
		
		Jugador[] equipo = new Jugador[3];
		
		equipo[0] = new Jugador("Claudio Bravo",12);
		equipo[1] = new Jugador("Gary Medel", 4);
		equipo[2] = new Jugador("Goku",1000);
		
		for(int i=0;i<equipo.length;i++){
			System.out.println(equipo[i].getNombre()+" "+equipo[i].getNumero());
		}
		
		
		
	}
}
