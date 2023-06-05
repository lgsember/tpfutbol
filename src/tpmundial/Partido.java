package tpmundial;

import javax.swing.JOptionPane;

public class Partido {

	private Equipo equipo1;
	private Equipo equipo2;
	private int goles1;
	private int goles2;

	public Partido(Equipo equipo1, Equipo equipo2) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
	}

	@Override
	public String toString() {
		return "Partido [equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", goles1=" + goles1 + ", goles2=" + goles2
				+ "]";
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public int getGoles1() {
		return goles1;
	}

	public void setGoles1(int goles1) {
		this.goles1 = goles1;
	}

	public int getGoles2() {
		return goles2;
	}

	public void setGoles2(int goles2) {
		this.goles2 = goles2;
	}

	public Equipo JugarPartido() {

		this.getEquipo1().getNombre();
		this.getEquipo2().getNombre();
		int lance = 0, ponte, gol1 = 0, gol2 = 0, chance, jugador = 0;

		// lances = gol, penal, tiro de esquina, posicion adelantada, travesaño,
		// chilena, patada al arco, tarjeta roja, tarjeta amarilla, árbitro, jugador
		// molestado, terminó el partido

		JOptionPane.showMessageDialog(null,
				"Empieza el partido entre " + this.getEquipo1().getNombre() + " y " + this.getEquipo2().getNombre());

		for (int i = 0; i < 4; i++) {

			lance = (int) (Math.random() * 6);

			switch (lance) {
			case 0:
				JOptionPane.showMessageDialog(null,
						this.getEquipo1().getNombre() + " se acerca a la portería de " + this.getEquipo2().getNombre());
				ponte = (int) (Math.random() * 3);
				if (ponte == 0) {
					JOptionPane.showMessageDialog(null, "Patada al arco");
					chance = (int) (Math.random() * 3);
					if (chance == 0) {
						jugador = (int) (Math.random() * this.getEquipo1().getJugadores().size());
						if (this.getEquipo1().getJugadores().get(jugador).isTitularidad()) {
							JOptionPane.showMessageDialog(null, "Goooooooooooool de "
									+ this.getEquipo1().getJugadores().get(jugador).getNombre() + "!!!");
							gol1 = gol1 + 1;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Travesaño!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Robaron el balón!");
				}
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Tiro de esquina para " + this.getEquipo1().getNombre());
				ponte = (int) (Math.random() * 3);
				if (ponte == 0) {
					JOptionPane.showMessageDialog(null, "Pase largo");
					chance = (int) (Math.random() * 3);
					if (chance == 0) {
						jugador = (int) (Math.random() * this.getEquipo1().getJugadores().size());
						if (this.getEquipo1().getJugadores().get(jugador).isTitularidad()) {
							JOptionPane.showMessageDialog(null, "Goooooooooooool de "
									+ this.getEquipo1().getJugadores().get(jugador).getNombre() + "!!!");
							gol1 = gol1 + 1;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Fuera!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Travesaño!");
				}
				break;
			case 2:
				jugador = (int) (Math.random() * this.getEquipo1().getJugadores().size());
				if (this.getEquipo1().getJugadores().get(jugador).isTitularidad()) {
					if (this.getEquipo1().getJugadores().get(jugador).isMolestado()) {
						JOptionPane.showMessageDialog(null, "Posicion adelantada de "+ this.getEquipo1().getJugadores().get(jugador).getNombre() + " del equipo " + this.getEquipo1().getNombre());
					} else {
						JOptionPane.showMessageDialog(null, "El jugador " + this.getEquipo1().getJugadores().get(jugador).getNombre() + " del equipo "+ this.getEquipo1().getNombre()  + " se lesionó " );
						this.getEquipo1().getJugadores().get(jugador).setMolestado(true);
					}
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null,
						this.getEquipo2().getNombre() + " se acerca a la portería de " + this.getEquipo1().getNombre());
				ponte = (int) (Math.random() * 3);
				if (ponte == 0) {
					JOptionPane.showMessageDialog(null, "Patada al arco");
					chance = (int) (Math.random() * 3);
					if (chance == 0) {
						jugador = (int) (Math.random() * this.getEquipo2().getJugadores().size());
						if (this.getEquipo2().getJugadores().get(jugador).isTitularidad()) {
							JOptionPane.showMessageDialog(null, "Goooooooooooool de "
									+ this.getEquipo2().getJugadores().get(jugador).getNombre() + "!!!");
							gol2 = gol2 + 1;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Travesaño!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Robaron el balón!");
				}
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Tiro de esquina para " + this.getEquipo2().getNombre());
				ponte = (int) (Math.random() * 3);
				if (ponte == 0) {
					JOptionPane.showMessageDialog(null, "Pase largo");
					chance = (int) (Math.random() * 3);
					if (chance == 0) {
						jugador = (int) (Math.random() * this.getEquipo2().getJugadores().size());
						if (this.getEquipo2().getJugadores().get(jugador).isTitularidad()) {
							JOptionPane.showMessageDialog(null, "Goooooooooooool de "
									+ this.getEquipo2().getJugadores().get(jugador).getNombre() + "!!!");
							gol2 = gol2 + 1;
						}
					} else {
						JOptionPane.showMessageDialog(null, "Fuera!");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Travesaño!");
				}
				break;
			case 5:
				jugador = (int) (Math.random() * this.getEquipo2().getJugadores().size());
				if (this.getEquipo2().getJugadores().get(jugador).isTitularidad()) {
					if (this.getEquipo2().getJugadores().get(jugador).isMolestado()) {
						JOptionPane.showMessageDialog(null, "Posicion adelantada de " + this.getEquipo2().getNombre());
					} else {
						JOptionPane.showMessageDialog(null, "El jugador "
								+ this.getEquipo2().getJugadores().get(jugador).getNombre() + " se lesionó");
						this.getEquipo2().getJugadores().get(jugador).setMolestado(true);
					}
				}
				break;
			default: JOptionPane.showMessageDialog(null, "Error");
				break;
			}

		}

		this.setGoles1(gol1);
		this.setGoles2(gol2);

		if (this.getGoles1() == this.getGoles2()) {
			JOptionPane.showMessageDialog(null, "Los equipos empataram. Vaya al penal!");
			lance = (int) (Math.random() * 2);
			if (lance == 0) {
				JOptionPane.showMessageDialog(null, getEquipo1().getNombre() + " ganó en los penales");
				return this.getEquipo1();
			} else {
				JOptionPane.showMessageDialog(null, getEquipo2().getNombre() + " ganó en los penales");
				return this.getEquipo2();
			}

		} else if (this.getGoles1() > this.getGoles2()) {
			JOptionPane.showMessageDialog(null, "El equipo que ganó es " + getEquipo1().getNombre());
			return this.getEquipo1();
		} else {
			JOptionPane.showMessageDialog(null, "El equipo que ganó es " + getEquipo2().getNombre());
			return this.getEquipo2();
		}

	}

}
