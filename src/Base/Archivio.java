package Base;

public class Archivio {
	private int indice=0;
	private Persona [] listaPersone;
	
	public Archivio(int dimensione) {
		listaPersone=new Persona[dimensione];
	}
	
	public boolean aggiungiPersona(Persona p) {
		if (indice <10) {
			listaPersone[indice++]=p;
			return true;
		}
		return false;
	}
	
	public Persona cerca(String cognome) {
		for (Persona p: listaPersone ) {
			if ( cognome.equals(p.getCognome()) ) {
				return p;
			}
		}
		return null;
	}
}
