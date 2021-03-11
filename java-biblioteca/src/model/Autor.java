package model;

/**
 * Classe para armazenar os dados do Autor
 * 
 * @author Gustavo Metzler Pontes
 * @since 18 de fev. de 2021
 * 
 */
public class Autor {
	// Declarando atributos da classe
	private int codigo;
	private String nome;
	private String nacionalidade;

	// Declatando método construtor vazio
	public Autor() {

	}

	// Getters and setters

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
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nacionalidade
	 */
	public String getNacionalidade() {
		return nacionalidade;
	}

	/**
	 * @param nacionalidade the nacionalidade to set
	 */
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

}
