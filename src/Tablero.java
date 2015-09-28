
public class Tablero {

		private char[][] casilla;
		
		public Tablero(){
			casilla = new char[3][3];
			for (int i = 0; i < casilla.length; i++) {
				for (int j = 0; j < casilla[i].length; j++) {
					casilla[i][j] = '-';
				}
			}
		}
		
		public void visualizar(){
			for (int i = 0; i < casilla.length; i++) {
				System.out.print("| ");
				for (int j = 0; j < casilla[i].length; j++) {
					System.out.print(casilla[i][j] + " | ");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
		
		public char[][] getTablero(){
			return this.casilla;
		}

		public char getCasilla(int coordenadaX, int coordenadaY) {
			return casilla[coordenadaX][coordenadaY];
		}

		public void setCasilla(int coordenadaX, int coordendaY, char valor) {
			this.casilla[coordenadaX][coordendaY] = valor;
		}
		
}
