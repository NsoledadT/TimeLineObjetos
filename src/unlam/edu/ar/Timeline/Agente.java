package unlam.edu.ar.Timeline;

import java.util.ArrayList;
import java.util.List;

public class Agente {
	private final int contraseña;
	private final String nombre;
	private Empresa contenido;
	private final List<Empresa> seguimiento = new ArrayList<Empresa>();

	public Agente(int contraseña, String nombre) {
		this.contraseña = contraseña;
		this.nombre = nombre;

	}

	public void setContenido(Empresa contenido){
		this.contenido = contenido;

	}

	public int getContraseña() {
		return this.contraseña;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setEmpresa(Empresa empresa){
		this.seguimiento.add(empresa);
	}

	public List<Empresa> getEmpresa() {
		return (seguimiento);
	}

	public String getTexto() {
		return this.contenido.getContenido().getTexto();
	}

	public int getVideo() {
		return this.contenido.getContenido().getVideo();
	}

}
