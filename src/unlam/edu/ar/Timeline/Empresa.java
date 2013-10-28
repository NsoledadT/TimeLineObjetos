package unlam.edu.ar.Timeline;


public class Empresa {
	private final String nombre;
	private final String rubro;
	private final String usuario;
	private final int contrase�a;
	private  Contenido contenido;


	public Empresa(String nombre, String rubro, String usuario, int contrase�a) {
		this.nombre = nombre;
		this.rubro = rubro;
		this.usuario = usuario;
		this.contrase�a = contrase�a;
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

    public int getContrase�a() {
    	return this.contrase�a;
	}

    public Contenido getContenido() {
    	return this.contenido;
    }

}
