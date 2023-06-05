package tpmundial;

public class Jugador {
	
	private String nombre;
	private String posicion;
	private int camiseta;
	private int edad;
	private boolean titularidad;
	private boolean molestado;
	
	public Jugador(String nombre, String posicion, int camiseta, int edad, boolean titularidad, boolean molestado) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.camiseta = camiseta;
		this.edad = edad;
		this.titularidad = titularidad;
		this.molestado = molestado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(int camiseta) {
		this.camiseta = camiseta;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isTitularidad() {
		return titularidad;
	}

	public void setTitularidad(boolean titularidad) {
		this.titularidad = titularidad;
	}

	public boolean isMolestado() {
		return molestado;
	}

	public void setMolestado(boolean molestado) {
		this.molestado = molestado;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", camiseta=" + camiseta + ", edad=" + edad
				+ ", titularidad=" + titularidad + ", molestado=" + molestado + "]";
	}
	
		


}
