package unlam.edu.ar.Timeline;

public class Contenido {
	private  Texto plano;
	private  Video avg;

	public void setTexto(Texto plano) {
		this.plano = plano;

	}

	public void setVideo(Video avg) {
		this.avg = avg;

	}

	public String getTexto(){
		return this.plano.getContenido();

	}

    public int getVideo(){
    	return this.avg.getVideo();

	}
}
