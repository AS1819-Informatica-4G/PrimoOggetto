
public class Principale {

	public static void main(String[] args) {
		Archivio a = new Archivio(10);
	    
		Persona p;
				
	    p=new Persona("Roberto", "Spotti", 53, 'm');
		
		a.aggiungiPersona(p);
		
		p=new Persona("Paolino", "Paperino",100,'m');
		
		p=new Persona("Topo", "Lino",100,'g');
		
		a.aggiungiPersona(p);
		
		p=a.cerca("Paperino");
	
		System.out.println(p.nome);
		System.out.println(p.cognome);
		System.out.println(p.eta);
		System.out.println(p.sesso);
		

	}

}
