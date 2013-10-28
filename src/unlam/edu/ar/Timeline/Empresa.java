package unlam.edu.ar.Timeline;


public class Empresa {
	private final String nombre;
	private final String rubro;
	private final String usuario;
	private final int contraseña;
	private  Contenido contenido;


	public Empresa(String nombre, String rubro, String usuario, int contraseña) {
		this.nombre = nombre;
		this.rubro = rubro;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public void setContenido(Contenido contenido) {
		this.contenido = contenido;
	}

    public String getNombre() {
		return this.nombre;
	}


    public String getRubro() {
    	return this.rubro;
	}

    public String getUsuario() {
    	return this.usuario;
	}

    public int getContraseña() {
    	return this.contraseña;
	}

    public Contenido getContenido() {
    	return this.contenido;
    }

}
