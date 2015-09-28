import java.util.Scanner;

public class Jugador {
	
	private Ficha[] ficha;
	private int id;

	public Jugador(int id) {
		ficha = new Ficha[3];
		for (int i = 0; i < ficha.length; i++) {
			ficha[i] = new Ficha(id);
		}
		this.setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void ponerFicha(Tablero tablero, int numFicha, int idJugador) {
		System.out.println("Introduce los datos para poner una nueva ficha");
		System.out.println("**********************************************");
		System.out.println("Las coordenadas tienen que terner un valor de 0, 1 o 2.");
		do{
			ficha[numFicha] = new Ficha(getTipoJugador(idJugador), obtenerX(), obtenerY(), idJugador);
		}while(!ficha[numFicha].esValida(tablero));
		tablero.setCasilla(ficha[numFicha].getCoordenada().getValorX(), ficha[numFicha].getCoordenada().getValorY(), ficha[numFicha].getValor());
		System.out.println(" ");
		tablero.visualizar();
	}

	public void moverFicha(Tablero tablero, Jugador jugador) {
		System.out.println("Introduce los datos para mover una ficha");
		System.out.println("**********************************************");
		System.out.println("Las coordenadas tienen que terner un valor de 0, 1 o 2.");
		System.out.println("Ficha origen:");
		Ficha ficha;
		do{
			ficha = new Ficha(getTipoJugador(jugador.id), obtenerX(), obtenerY(), jugador.id);
		}while(!jugador.esSuFicha(ficha));
		int numFicha = numFicha(ficha.getCoordenada().getValorX(), ficha.getCoordenada().getValorY());
		tablero.setCasilla(this.ficha[numFicha].getCoordenada().getValorX(), this.ficha[numFicha].getCoordenada().getValorY(), '-');
		this.ficha[numFicha] = ficha;
		System.out.println("Poner en:");
		do{
			this.ficha[numFicha] = new Ficha(getTipoJugador(jugador.id), obtenerX(), obtenerY(), jugador.id);
		}while(!this.ficha[numFicha].esValida(tablero));
		tablero.setCasilla(this.ficha[numFicha].getCoordenada().getValorX(), this.ficha[numFicha].getCoordenada().getValorY(), this.ficha[numFicha].getValor());
		System.out.println(" ");
		tablero.visualizar();
	}

	private boolean esSuFicha(Ficha ficha) {
		for(int i = 0; i < this.ficha.length; i++){
			if(this.ficha[i].equals(ficha)){
				return true;
			}
		}
		return false;
	}
	
	private int numFicha(int coordenadaX, int coordenadaY){
		for(int i = 0; i < 3; i++){
			if((ficha[i].getCoordenada().getValorX() == coordenadaX) && (ficha[i].getCoordenada().getValorY() == coordenadaY)){
				return i;
			}
		}
		return 0;
	}

	private int obtenerX(){
		int num;
		do{
			System.out.print("Coordenada X: ");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			num = in.nextInt();
		}while((num < 0) || (num > 2));
		return num;
	}
	
	private int obtenerY(){
		int num;
		do{
			System.out.print("Coordenada Y: ");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			num = in.nextInt();
		}while((num < 0) || (num > 2));
		return num;
	}
	
	private char getTipoJugador(int idJugador){
		switch (idJugador) {
		case 0: return 'X'; 
		case 1: return 'O'; 
		default: break;
		}
		return '?';
	}
}
