package model;

/**
 * Classe para armazenar os dados da editora
 * 
 * @author Gustavo Metzler Pontes
 * @since 18 de fev. de 2021
 * 
 */
public class Editora {
	// Declarando atributos
	private int codigo;
	private String nome;
	private String pais;

	// Declarando construtor vazio
	public Editora() {

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
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

}
