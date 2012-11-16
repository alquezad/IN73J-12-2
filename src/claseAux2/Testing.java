package claseAux2;

public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Jugador messi = new Jugador("Lionel Messi",12);
		Arquero casillas = new Arquero("Iker Casillas",1);
		
		for(int i=0;i<10;i++){
			int direccionMessi = messi.patearPenal();
		
		
			int direccionCasillas = casillas.atajarPenal();
		
		
			if(direccionMessi==direccionCasillas)
				System.out.println("Gooooooooool!!!");
			else
				System.out.println("Tapadón de Casillas");
		}

	}

}
