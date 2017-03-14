import java.util.Arrays;

public class Lector {
	
	private int nSocio;
	private String nombre;
	private Libro[] historicoLectura;
	private int nlibros;
	
	public Lector(int nSocio, String nombre){
		this.nSocio = nSocio;
		this.nombre = nombre;
		this.historicoLectura = new Libro[10];
		this.nlibros = 0;
	}

	public int getnSocio(){
		return nSocio;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String listarHistorico(){
		String aux = new String("");
		for (int i = 0; i < nlibros; i++){
			aux = aux + historicoLectura[i].getTitulo();
			if (i != nlibros - 1){
				aux = aux + ", ";
			}
		}
		return aux;
	}
	
	public void leerLibro(Libro libro){
		if(nlibros == 10){
			for (int i = 0; i < 9; i++){
				historicoLectura[i] = historicoLectura[i+1];
			}
		}
		else{
			nlibros++;
		}
		historicoLectura[nlibros - 1] = libro;
		libro.prestado();
	}
	
	public boolean esIgual(Lector comp2){
		return this.nSocio==comp2.getnSocio() &&  Arrays.equals(this.historicoLectura, comp2.historicoLectura);
	}
}
