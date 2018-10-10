package Base;

public class Persona {
	
	static int conta=0; // attributo di classe
	
	
	String nome; //attributi di istanza
	private String cognome;
	private int eta;
	private char sesso;
	
	public Persona() {conta++;}
	
	public Persona(String n, 
			       String cognome, 
			       int eta, 
			       char sesso) {
	
		nome = n;
		this.cognome = cognome;
		this.eta = eta;
		setSesso(sesso);
		conta++;
	}

	static int quantiOggetti() {
		return conta;
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
		
		this.nome = nome.toLowerCase();
	}

	/**
	 * @return the cognome
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * @param cognome the cognome to set
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * @return the eta
	 */
	public int getEta() {
		return eta;
	}

	/**
	 * @param eta the eta to set
	 */
	public void setEta(int eta) {
		if (eta>=0) this.eta = eta;
	}

	public char getSesso() {
		return sesso;
	}

	public void setSesso(char sesso) {
		if (sesso=='m') sesso='M';
		if (sesso=='f') sesso='F';
		this.sesso = sesso;
	}

	
}
