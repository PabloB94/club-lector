import fecha.Fecha;
public class Libro {
	
	private String autor;
	private String titulo;
	private Fecha fechaPublicacion;
	private int nVecesPrestado;

	public Libro (String titulo, String autor, Fecha fechaPublicacion){
		this.autor = autor;
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
		this.nVecesPrestado = 0;
	}
	
	public String getAutor(){
		return this.autor;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public Fecha getFechaPublicacion(){
		return this.fechaPublicacion;
	}
	
	public int getnVecesPrestado(){
		return this.nVecesPrestado;
	}
	
	public void prestado(){
		nVecesPrestado++;
	}
	
//	public boolean esIgual(Libro comp2){
//		return (this.getAutor().equals(comp2.getAutor())) && (this.getFechaPublicacion()==comp2.getFechaPublicacion()) && (this.getTitulo().equals(comp2.getTitulo()));
//	}
	public boolean esIgual(Libro libro){
        return this.titulo.equals(libro.titulo) && this.autor.equals(libro.autor) && this.fechaPublicacion.equals(libro.fechaPublicacion);
    }

	public String toString(Libro libro){
		return (libro.getTitulo() + ", " + libro.getAutor() + ", leído: " + libro.getnVecesPrestado());
	}
	
}
