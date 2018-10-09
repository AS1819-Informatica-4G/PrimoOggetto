
public class Persona {
	String nome;
	String cognome;
	int eta;
	char sesso;
	
	public Persona(String n, 
			       String cognome, 
			       int eta, 
			       char sesso) {
		nome = n;
		this.cognome = cognome;
		this.eta = eta;
		this.sesso = sesso;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", sesso=" + sesso + "]";
	}

}
