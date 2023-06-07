package tpfutbol;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Equipo {
	
	private String nom;
	private String ciudad;
	LinkedList<Jugador> jugadores = new LinkedList<Jugador>();
	
	public Equipo(String nom, String ciudad) {
		super();
		this.nom = nom;
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nom + ", ciudad=" + ciudad + ", jugadores=" + jugadores + "]";
	}

	public String getNombre() {
		return nom;
	}

	public void setNombre(String nombre) {
		this.nom = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public LinkedList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(LinkedList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public boolean AgregarJugador(String nombre, String posicion, int camiseta, int edad, boolean titularidad, boolean molestado, int titulo, int cantitular) {
		String []posiciones= {"Arquero" , "Delantero", "Defensor", "Mediocampista"};

		if (this.getJugadores().element().isTitularidad()) {
			cantitular=cantitular+1;
		}
		
		if (edad<18) {
			while (edad<18) {
				edad = Integer.parseInt(JOptionPane.showInputDialog("El jugador no puede ser menor de edad."));
			}
		}
		
		for (int i = 0; i < this.getJugadores().size(); i++)
			if (camiseta==this.getJugadores().get(i).getCamiseta()) {
				while (camiseta==this.getJugadores().get(i).getCamiseta()) {
					camiseta = Integer.parseInt(JOptionPane.showInputDialog("Numero de camiseta " + this.getJugadores().get(i).getCamiseta() + " no disponible. Elegir otro."));
					i=0;
				}
			}
		
		for (int i = 0; i < this.getJugadores().size(); i++)
			if (posicion.equals("Arquero")) {
				while (posicion.equals("Arquero")) {
					posicion = (String)JOptionPane.showInputDialog(null, "Este equipo ya tiene un arquero. Eligir otra posicion", "Eligir otra posicion de jugador", JOptionPane.DEFAULT_OPTION, null, posiciones, posiciones[0]);
					i=0;
				}
			}
		
		
		if (cantitular>10) {
			JOptionPane.showMessageDialog(null, "Número de titulares superado en este equipo.\nSi hay espacio, este jugador se agregará como suplente.");
			titulo=1;
		}
		if (titulo==1) {
			titularidad=false;
		} else {
			titularidad=true;
			cantitular=cantitular+1;
		}
		
		
		if (this.getJugadores().size()>21) {
			JOptionPane.showMessageDialog(null, "No hay más espacio en este equipo.");
			return false;
		} else {
			this.getJugadores().add(new Jugador(nombre, posicion, camiseta, edad, titularidad, molestado));
			if (titularidad) {
				cantitular=cantitular+1;
			}
			JOptionPane.showMessageDialog(null, "Jugador " + nombre + " agregado.");
			return true;
		}
	
	}
	
	public boolean EliminarJugador(int cantitular) {
		
		int borrarJugador = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de la camiseta del jugador que quieres eliminar de la lista"));
		
		for (Jugador jugadoreliminado : jugadores)
			if (jugadoreliminado.getCamiseta()==borrarJugador) {
				jugadores.remove(jugadoreliminado);
				JOptionPane.showMessageDialog(null, "Jugador " + jugadoreliminado.getNombre() + " eliminado de la lista");
				if (jugadoreliminado.isTitularidad()) {
					cantitular = cantitular - 1;
				}
				return true;
			}
		
		JOptionPane.showMessageDialog(null, "Ningun jugador fue eliminado de la lista");
		return false;
	}
	
	public Jugador BuscarJugador() {
		
		int buscarJugador = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de la camiseta del jugador que quieres ver"));
		
		for (Jugador jugador : jugadores) {
            if (jugador.getCamiseta()==(buscarJugador)) {
                return jugador;
            }
        }
		JOptionPane.showMessageDialog(null, "Ningun jugador encontrado con este numero de camiseta");
		return null;
	}
	
	public int CantidadJugadores() {
		
		if (this.getJugadores().isEmpty()) {
			return 0;
		}
		
		return jugadores.size();

	}
	
	public String VerLista() {
		
		String acum = "Lista de todos los jugadores que tienes en el equipo " + this.nom + ":";
		
		if (this.getJugadores().isEmpty()) {
			return "No hay jugadores en " + this.nom;
		} else {
			for (Jugador todosjugadores : jugadores) {
				acum = acum + "\n ----------------------------- \nNombre: " + todosjugadores.getNombre() + " | Edad: " + todosjugadores.getEdad()  + "\nCamiseta: " + todosjugadores.getCamiseta() + " | Posicion: " + todosjugadores.getPosicion();
			}
		}
		return acum;
	}
	
	
	public void CargarJugador() {
		Jugador jugador1 = new Jugador("Juan", "Delantero", 10, 25, true, false);
	    Jugador jugador2 = new Jugador("Jose", "Defensor", 5, 22, true, false);
	    Jugador jugador3 = new Jugador("Bruno", "Mediocampista", 7, 23, true, false);
	    Jugador jugador4 = new Jugador("Gabriel", "Mediocampista", 12, 21, true, false);
	    Jugador jugador5 = new Jugador("Marcelo", "Delantero", 1, 21, true, false);
	    Jugador jugador6 = new Jugador("Yuri", "Arquero", 9, 20, true, false);
	    Jugador jugador7 = new Jugador("Lucas", "Defensor", 77, 28, true, false);
	    Jugador jugador8 = new Jugador("Rodrigo", "Mediocampista", 64, 20, true, false);
	    Jugador jugador9 = new Jugador("Natan", "Delantero", 13, 26, true, false);
	    Jugador jugador10 = new Jugador("Daniel", "Mediocampista", 8, 19, true, false);
	    //Jugador jugador11 = new Jugador("Diego", "Defensor", 25, 21, true, false);
		this.getJugadores().add(jugador1);
		this.getJugadores().add(jugador2);
		this.getJugadores().add(jugador3);
		this.getJugadores().add(jugador4);
		this.getJugadores().add(jugador5);
		this.getJugadores().add(jugador6);
		this.getJugadores().add(jugador7);
		this.getJugadores().add(jugador8);
		this.getJugadores().add(jugador9);
		this.getJugadores().add(jugador10);
		//this.getJugadores().add(jugador11);
	}
	
	public void CargarJugadorfalso() {
		
		String []nombrefalso = {"Miguel", "Davi", "Gomez", "Renato", "Pedro", "Santi", "Gonzalo", "Perez", "Hector", "Alex", "Julio"};
		
		for (int i = 0; i < 11; i++) {
			Jugador jugador = new Jugador(nombrefalso[i], "posicion", i+1, 20, true, false);
			this.getJugadores().add(jugador);
		}
	}
	
	

}
