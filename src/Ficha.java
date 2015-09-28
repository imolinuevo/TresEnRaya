
public class Ficha {
	
	private char valor;
	private int coordenadaX;
	private int coordenadaY;
	private int duenyo;
	
	public Ficha(int duenyo){
		this.duenyo = duenyo;
	}
	
	public Ficha(char valor, int coordenadaX, int coordenadaY, int duenyo){
		this.valor = valor;
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.duenyo = duenyo;
	}

	public char getValor() {
		return valor;
	}

	public void setValor(char valor) {
		this.valor = valor;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public int getDuenyo() {
		return duenyo;
	}

	public void setDuenyo(int duenyo) {
		this.duenyo = duenyo;
	}

	public boolean esValida(Tablero tablero) {
		if (tablero.getCasilla(coordenadaX, coordenadaY) == '-') {
			return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ficha other = (Ficha) obj;
		if (coordenadaX != other.coordenadaX)
			return false;
		if (coordenadaY != other.coordenadaY)
			return false;
		return true;
	}

	
}
