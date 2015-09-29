package Model;

public class TresEnRaya {
	
		Jugador[] jugador;
		Tablero tablero;

		public TresEnRaya(){
			jugador = new Jugador[2];
			for (int i = 0; i < jugador.length; i++) {
				jugador[i] = new Jugador(i);
			}
			tablero = new Tablero();
		}
		
		public void jugar(){
			//	Presentación del juego
			System.out.println("Bienvenido al juego de Tres en raya");
			System.out.println("===================================");
			tablero.visualizar();
			//	Fase de posición de fichas
			for(int i = 0; (i < 3) & (!tablero.finDelJuego()); i++){
				for(int j = 0; (j < jugador.length) & (!tablero.finDelJuego()); j++){
					System.out.println("Jugador " + j);
					jugador[j].ponerFicha(tablero, i, j);
				}
			}
			if(tablero.finDelJuego()){
				System.out.println("¡Enhorabuena! El jugador " + tablero.ganador() + " ha ganado.");
			} 
			//	Fase de movimiento de fichas
			else {
				do{
					for(int i = 0; (i < jugador.length) & (!tablero.finDelJuego()); i++){
						jugador[i].moverFicha(tablero, jugador[i]);
					}
				}while(!tablero.finDelJuego());
				System.out.println("¡Enhorabuena! El jugador " + tablero.ganador() + " ha ganado.");
			}
		}
		
		public static void main(String[] args){
			new TresEnRaya().jugar();
		}
}
