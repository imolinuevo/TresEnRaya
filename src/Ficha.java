
public class Ficha {
	
	private char valor;
	private Coordenada coordenada;
	private int duenyo;
	
	public Ficha(int duenyo){
		this.duenyo = duenyo;
	}
	
	public Ficha(char valor, int coordenadaX, int coordenadaY, int duenyo){
		this.valor = valor;
		this.coordenada = new Coordenada(coordenadaX, coordenadaY);
		this.duenyo = duenyo;
	}

	public char getValor() {
		return valor;
	}

	public void setValor(char valor) {
		this.valor = valor;
	}

	public int getDuenyo() {
		return duenyo;
	}

	public void setDuenyo(int duenyo) {
		this.duenyo = duenyo;
	}

	public boolean esValida(Tablero tablero) {
		if (tablero.getCasilla(this.coordenada.getValorX(), this.coordenada.getValorY()) == '-') {
			return true;
		}
		return false;
	}
	
	public Coordenada getCoordenada() {
		return this.coordenada;
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
		if (this.coordenada.getValorX() != other.getCoordenada().getValorX())
			return false;
		if (this.coordenada.getValorY() != other.getCoordenada().getValorY())
			return false;
		return true;
	}

	
}
