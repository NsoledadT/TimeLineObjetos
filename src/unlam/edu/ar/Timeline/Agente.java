package unlam.edu.ar.Timeline;

import java.util.ArrayList;
import java.util.List;

public class Agente {
	private final int contrase�a;
	private final String nombre;
	private Empresa contenido;
	private final List<Empresa> seguimiento = new ArrayList<Empresa>();

	public Agente(int contrase�a, String nombre) {
		this.contrase�a = contrase�a;
		this.nombre = nombre;

	}

	public void setContenido(Empresa contenido){
		this.contenido = contenido;

	}

	public int getContrase�a() {
		return this.contrase�a;
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
