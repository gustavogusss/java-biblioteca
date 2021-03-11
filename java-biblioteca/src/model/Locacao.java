package model;

/**
 * Classe para armazenar os dados da locação
 * 
 * @author Gustavo Metzler Pontes
 * @since 18 de fev. de 2021
 * 
 */
public class Locacao {
	// Declarando atributos
	private int codigo;
	private Data dataLocacao;
	private Data dataDevolucao;
	private Livro livros[];
	private Usuario usuario;

	// Construtor vazio
	public Locacao() {

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
	 * @return the dataLocacao
	 */
	public Data getDataLocacao() {
		return dataLocacao;
	}

	/**
	 * @param dataLocacao the dataLocacao to set
	 */
	public void setDataLocacao(Data dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	/**
	 * @return the dataDevolucao
	 */
	public Data getDataDevolucao() {
		return dataDevolucao;
	}

	/**
	 * @param dataDevolucao the dataDevolucao to set
	 */
	public void setDataDevolucao(Data dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	/**
	 * @return the livros
	 */
	public Livro[] getLivros() {
		return livros;
	}

	/**
	 * @param livros the livros to set
	 */
	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
