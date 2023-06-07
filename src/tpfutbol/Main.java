package tpfutbol;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int cantitular=0, opcion=0;
		boolean titularidad = false, molestado = false; 
		String selequipo="";
		
		Gerenciador gestor = new Gerenciador();
		gestor.CargarEquipo();
		
		Partido partido1 = new Partido(gestor.getEquipos().get(0), gestor.getEquipos().get(1));
		
		String []titular= {"Si", "No"};
		String []posiciones= {"Arquero" , "Delantero", "Defensor", "Mediocampista"};
		String []opciones= {"Agregar nuevo jugador", "Ver cantidad de jugadores", "Ver lista de jugadores", "Eliminar un jugador", "Buscar jugador", "Iniciar partido", "Salir"};
		String []equipos = new String[gestor.getEquipos().size()];
		
		for (Equipo equipo : gestor.getEquipos()) {
			equipos[gestor.getEquipos().indexOf(equipo)]=equipo.getNombre();
			if (equipo.getNombre().equals("Remo")) {
				equipo.CargarJugador();
			} else {
				equipo.CargarJugadorfalso();
			}
		}	
	
		
		do {
		
		opcion = JOptionPane.showOptionDialog(null, "Hola, bienvenido a tu mundial! Eligir una opcion para empezar.", "Tu Mundial", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		switch (opcion) {
		case 0:
			String nombrejugador = JOptionPane.showInputDialog("Ingresar nombre del nuevo jugador");
			String posicion = (String)JOptionPane.showInputDialog(null, "Elegir posicion de este jugador", "Posicion del jugador", JOptionPane.DEFAULT_OPTION, null, posiciones, posiciones[0]);
			int camiseta = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de la camiseta de este jugador"));
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad de este jugador"));
			int titulo = JOptionPane.showOptionDialog(null, "Es titular?", "Titularidad", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, titular, titular[0]);
			
					
			selequipo = (String)JOptionPane.showInputDialog(null, "Elegir equipo de este jugador", "Selección de Equipo", JOptionPane.DEFAULT_OPTION, null, equipos, equipos[0]);
						
					for (Equipo equipo : gestor.getEquipos()) {
						if (selequipo.equals(equipo.getNombre())) {
							if (equipo.AgregarJugador(nombrejugador, posicion, camiseta, edad, titularidad, molestado, cantitular, titulo)) {
								cantitular=cantitular+1;
							}
						}
					}
			break;
		case 1:
			selequipo = (String)JOptionPane.showInputDialog(null,"Elegir equipo para ver cantidad de jugadores", "Cantidad de jugadores en Equipo", JOptionPane.DEFAULT_OPTION, null, equipos, equipos[0]);
	
			for (Equipo equipo : gestor.getEquipos()) {
				if (selequipo.equals(equipo.getNombre())) {
					JOptionPane.showMessageDialog(null, "Cantidad de Jugadores en equipo " + equipo.getNombre() + ": " + equipo.CantidadJugadores());
					}
			}
			break;
		case 2:
			selequipo = (String)JOptionPane.showInputDialog(null, "Elegir equipo para ver sus jugadores", "Lista de jugadores en Equipo", JOptionPane.DEFAULT_OPTION, null, equipos, equipos[0]);
			
			for (Equipo equipo : gestor.getEquipos()) {
				if (selequipo.equals(equipo.getNombre())) {
					JOptionPane.showMessageDialog(null, equipo.VerLista());
					}
			}
			break;
		case 3:
			selequipo = (String)JOptionPane.showInputDialog(null, "Elegir equipo para eliminar jugador", "Eliminar jugador de un Equipo", JOptionPane.DEFAULT_OPTION, null, equipos, equipos[0]);
			
			for (Equipo equipo : gestor.getEquipos()) {
				if (selequipo.equals(equipo.getNombre())) {
					equipo.EliminarJugador(cantitular);
					}
			}
			break;
		case 4:
			selequipo = (String)JOptionPane.showInputDialog(null, "Elegir equipo para buscar jugador", "Buscar jugador de un Equipo", JOptionPane.DEFAULT_OPTION, null, equipos, equipos[0]);
			
			for (Equipo equipo : gestor.getEquipos()) {
				if (selequipo.equals(equipo.getNombre())) {
					JOptionPane.showMessageDialog(null, equipo.BuscarJugador());
					}
			}
			break;
		case 5:
			partido1.JugarPartido();
			//controlar para que no se repita el mismo partido
			break;
		default:
			break;
		}
	
		} while (opcion!=6);

	}

}


