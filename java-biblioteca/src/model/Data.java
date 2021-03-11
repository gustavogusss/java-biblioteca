package model;

/**
 * Classe para armazenar dados de uma data
 * 
 * @author Gustavo Metzler Pontes
 * @since 18 de fev. de 2021
 * 
 */
public class Data {
	// Declarando atributos
	private int dia;
	private int mes;
	private int ano;

	// Declarando Método construtor vazio
	public Data() {

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dia + "/" + mes + "/" + ano;
	}

	// Getters and setters
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

}
