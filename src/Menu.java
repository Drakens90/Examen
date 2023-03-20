import java.io.Serializable;
import java.sql.SQLException;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Menu {

	public static void   main(String[] args) {

		
		String opcion = null;
		
		

		do {
			
			try {

				 String opciones = JOptionPane.showInputDialog("Elige una opción \n 1-Añadir Jugador \n 2-Ver Lista \n 3-Borrar de la Lista \n 4-Salir", null);
				
				if (opciones.equals("1")) {
					JOptionPane.showInputDialog("Añadir Nombre Jugador");
					Jugador jugador = new Jugador(opcion, opciones, 0, 0, 0);{
						Jugador.setTotalJugadores(+1);
						JOptionPane.showMessageDialog(null, Jugador.getTotalJugadores());
					}
	
				}
				if (opciones.equals("2")) {
					JOptionPane.showInputDialog("Listar jugadores");
					JOptionPane.showMessageDialog(null, Jugador.getTotalJugadores());
				}
				if (opciones.equals("3")) {
					JOptionPane.showInputDialog("Borrar jugador");
				}
				if (opciones.equals("4")) {
					JOptionPane.showMessageDialog(null, "Has Salido");break;
				}

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "AH AH AH No has dicho la palabra mágica");
			}
		} while (true);
	}
//	
//	Pruebas 
	public static class Jugador {

		static int totalJugadores =0;
		public String Nombre;
		public String Equipo;
		public int Numero;
		public double Altura;
		public int ID;
		
//		Constructor
		public Jugador(String nombre, String equipo, int Numero, double altura, int iD) {
			super();
			this.Nombre = nombre;
			this.Equipo = equipo;
			this.Numero = Numero;
			this.Altura = altura;
			this.ID = iD;		
		}
//			Getter y Setter
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


		
			
			
		
		
		
	}	

	