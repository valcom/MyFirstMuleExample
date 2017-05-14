/**
 * 
 */
package com.myws.utils;

/**
 * @author valer
 *
 */
public class JsonPojoClazz {
	private String nome;
	private String cognome;
	private String codiceIban;

	public JsonPojoClazz() {
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodiceIban() {
		return codiceIban;
	}
	public void setCodiceIban(String codiceIban) {
		this.codiceIban = codiceIban;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\r\n nome:" + nome);
		sb.append("\r\n cognome:" + cognome);
		sb.append("\r\n iban:" + codiceIban); 
		return sb.toString(); 
	}
}
