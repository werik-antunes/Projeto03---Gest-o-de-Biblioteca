package gestaoDeBiblioteca;

public class Livro {

	private String titulo;
	private String autor;
	private int numPaginas;
	private boolean disponivel;

	public Livro(String titulo, String autor, int numPaginas) {

		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.disponivel = true;

	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	@Override

	public String toString() {

		return "Livro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", numPaginas=" + numPaginas
				+ ", disponivel=" + disponivel + '}';

	}

}
