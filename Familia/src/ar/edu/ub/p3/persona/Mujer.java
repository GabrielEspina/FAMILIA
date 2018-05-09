package ar.edu.ub.p3.persona;
import ar.edu.ub.p3.familia.Familiar;
 public class Mujer extends Persona{

	 Mujer (Familiar familia){
		 super(familia,null,null);
		 
	 }
	 
	 Mujer(Familiar familia, Persona padre, Persona madre) {
		super(familia, padre,  madre);
		padre.addHija(this);
		madre.addHija(this);
		
		// TODO Auto-generated constructor stub
	}
	 
	 public String getGenero(){
		 return "Mujer";
	 }

}
