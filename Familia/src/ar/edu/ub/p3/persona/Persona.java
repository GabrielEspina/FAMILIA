package ar.edu.ub.p3.persona;

import java.util.LinkedList;

import ar.edu.ub.p3.familia.Familiar;

public abstract class Persona {
	
	private Familiar  familiar;
	
	private Persona  madre;
	private Persona	 padre;
	
	private LinkedList<Hombre>	hijos;
	private LinkedList<Mujer>	hijas;
	
	public Persona(Familiar familia, Persona padre, Persona madre) {
		
		setFamilia(familia);
		
		setPadre(padre);
		setMadre(madre);
		
		hijos = new LinkedList < Hombre > ();
		hijas = new LinkedList < Mujer >  ();
		
	}
	
	public void addHijo(Hombre hijo) {
		
		getHijos().add(hijo);
		
	}
	
	public void addHija(Mujer hija) {
	
		getHijas().add(hija);
		
	}
	
	public abstract String getGenero();
	
	public final static Persona construirHombre(Familiar familiar, Persona padre, Persona madre){
		
		return new Hombre(familiar,padre, madre);
	}
	
	public static Persona construirHombre(Familiar familiar){
		return new Hombre(familiar);
	}
	
	public static Persona construirMujer(Familiar familiar, Persona padre, Persona madre){
		return new Mujer(familiar,padre, madre);
	}
	
	public static Persona construirMujer(Familiar familiar){
		return new Mujer(familiar);
	}



	public LinkedList<Hombre> getHijos() {
		return hijos;
	}


	public LinkedList<Mujer> getHijas() {
		return hijas;
	}


	public Persona getMadre() {
		return madre;
	}

	public void setMadre(Persona madre) {
		this.madre = madre;
	}

	public Persona getPadre() {
		return padre;
	}

	public void setPadre(Persona padre) {
		this.padre = padre;
	}
	
	

	public Familiar getFamiliar() {
		return familiar;
	}
	
	

	private void setFamilia(Familiar familiae) {
		this.familiar = familiae;
	}
}
