package model;

/**
 * Classe para armazenar os dados do livro
 * 
 * @author Gustavo Metzler Pontes
 * @since 18 de fev. de 2021
 * 
 */
public class Livro {
	// Declarando atributos
	private int codigo;
	private String titulo;
	private Editora editora;
	private Autor autor;
	private int anoPublicacao;
	private boolean disponivel;

	
//	Construtor vazio
	public Livro() {

	}
	
	
/**
	 * @return the disponivel
	 */
	public boolean isDisponivel() {
		return disponivel;
	}

	/**
	 * @param disponivel the disponivel to set
	 */
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	

	// Getters e setters

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the editora
	 */
	public Editora getEditora() {
		return editora;
	}

	/**
	 * @param editora the editora to set
	 */
	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	/**
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	/**
	 * @return the anoPublicacao
	 */
	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	/**
	 * @param anoPublicacao the anoPublicacao to set
	 */
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
}
