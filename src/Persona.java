
public class Persona {
	String nome;
	String cognome;
	int eta;
	private char sesso;
	
	public Persona(String n, 
			       String cognome, 
			       int eta, 
			       char sesso) {
		nome = n;
		this.cognome = cognome;
		this.eta = eta;
		setSesso(sesso);
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
