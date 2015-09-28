
public class Turno {
	
	public Turno(){
		
	}

	public boolean finDelJuego(Tablero tablero) {
		for(int i = 0; i < 3; i++){
			if((tablero.getCasilla(i, 0) == tablero.getCasilla(i, 1)) && (tablero.getCasilla(i, 0) == (tablero.getCasilla(i, 2)))){
				if(tablero.getCasilla(i, 0) != '-'){
					return true;
				}
			}
		}
		for(int j = 0; j < 3; j++){
			if((tablero.getCasilla(0, j) == tablero.getCasilla(1, j)) && (tablero.getCasilla(0, j) == (tablero.getCasilla(2, j)))){
				if(tablero.getCasilla(0, j) != '-'){
					return true;
				}
			}
		}
		return false;
	}

	public char ganador(Tablero tablero) {
		for(int i = 0; i < 3; i++){
			if((tablero.getCasilla(i, 0) == tablero.getCasilla(i, 1)) && (tablero.getCasilla(i, 0) == (tablero.getCasilla(i, 2)))){
				if(tablero.getCasilla(i, 0) != '-'){
					return tablero.getCasilla(i, 0);
				}
			}
		}
		for(int j = 0; j < 3; j++){
			if((tablero.getCasilla(0, j) == tablero.getCasilla(1, j)) && (tablero.getCasilla(0, j) == (tablero.getCasilla(2, j)))){
				if(tablero.getCasilla(0, j) != '-'){
					tablero.getCasilla(0, j);
				}
			}
		}
		return '?';
	}

}
