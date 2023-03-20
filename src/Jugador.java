
public class Jugador {

	static int totalJugadores =0;
	public String Nombre;
	public String Equipo;
	public int Numero;
	public double Altura;
	public int ID;
	
//	Constructor
	public Jugador(String nombre, String equipo, int Numero, double altura, int iD) {
		super();
		this.Nombre = nombre;
		this.Equipo = equipo;
		this.Numero = Numero;
		this.Altura = altura;
		this.ID = iD;		
	}

//		Getter y Setter
	
	public static int getTotalJugadores() {
		return totalJugadores;
	}

	public static void setTotalJugadores(int totalJugadores) {
		Jugador.totalJugadores = totalJugadores;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getEquipo() {
		return Equipo;
	}

	public void setEquipo(String equipo) {
		Equipo = equipo;
	}

	public Integer getNumero() {
		return Numero;
	}

	public void setNumeroJugador(Integer numero) {
		this.Numero = numero;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}

	public Integer getIDjugador() {
		return ID;
	}

	public void setIDjugador(Integer iDjugador) {
		ID = iDjugador;
	}
	
	
	
	
	
}
