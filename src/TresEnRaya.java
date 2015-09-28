
public class TresEnRaya {
	
		Jugador[] jugador;
		Tablero tablero;
		Turno turno;

		public TresEnRaya(){
			jugador = new Jugador[2];
			for (int i = 0; i < jugador.length; i++) {
				jugador[i] = new Jugador(i);
			}
			tablero = new Tablero();
			turno = new Turno();
		}
		
		public void jugar(){
			//	Presentación del juego
			System.out.println("Bienvenido al juego de Tres en raya");
			System.out.println("===================================");
			tablero.visualizar();
			//	Fase de posición de fichas
			for(int i = 0; (i < 3) & (!turno.finDelJuego(tablero)); i++){
				for(int j = 0; (j < jugador.length) & (!turno.finDelJuego(tablero)); j++){
					System.out.println("Jugador " + j);
					jugador[j].ponerFicha(turno, tablero, i, j);
				}
			}
			if(turno.finDelJuego(tablero)){
				System.out.println("¡Enhorabuena! El jugador " + turno.ganador(tablero) + " ha ganado.");
			} 
			//	Fase de movimiento de fichas
			else {
				do{
					for(int i = 0; (i < jugador.length) & (!turno.finDelJuego(tablero)); i++){
						jugador[i].moverFicha(turno, tablero, jugador[i]);
					}
				}while(!turno.finDelJuego(tablero));
				System.out.println("¡Enhorabuena! El jugador " + turno.ganador(tablero) + " ha ganado.");
			}
		}
		
		public static void main(String[] args){
			new TresEnRaya().jugar();
		}
}
