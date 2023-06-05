package tpmundial;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Gerenciador {
	
	private LinkedList<Equipo> equipos = new LinkedList<Equipo>();

	public Gerenciador() {
		super();
	}

	@Override
	public String toString() {
		return "Gerenciador [equipos=" + equipos + "]";
	}

	public LinkedList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(LinkedList<Equipo> equipos) {
		this.equipos = equipos;
	}

	public void CargarEquipo() {
		Equipo remo = new Equipo("Remo","Belém");
		Equipo paysandu = new Equipo("Paysandu","Belém");
		Equipo flamengo = new Equipo("Flamengo","Rio de Janeiro");
		Equipo fluminense = new Equipo("Fluminense","Rio de Janeiro");
		this.getEquipos().add(remo);
		this.getEquipos().add(paysandu);
		this.getEquipos().add(flamengo);
		this.getEquipos().add(fluminense);
	}
	
	public boolean AgregarEquipo(String nom, String ciudad) {
		
		if (this.getEquipos().size()>7) {
			JOptionPane.showMessageDialog(null, "Límite de equipo alcanzado.");
			return false;
		} else {
			this.getEquipos().add(new Equipo(nom, ciudad));
			JOptionPane.showMessageDialog(null, "Equipo agregado.");
			return true;
			
		}
	}
	
	/*
Eliminar un equipo de la lista.
Buscar un equipo por nombre.
Obtener la cantidad total de equipos.
Obtener la lista de equipos.
*/
	
}