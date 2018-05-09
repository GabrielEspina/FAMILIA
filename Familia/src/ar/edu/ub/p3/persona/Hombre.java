package ar.edu.ub.p3.persona;
import ar.edu.ub.p3.familia.Familiar;
 public class Hombre	extends Persona {

	 
	 Hombre(Familiar familia){
		 super(familia,null,null);
		 
	 }
	 
	 
	 Hombre(Familiar familia, Persona padre,Persona madre) {
		super(familia,padre, madre);
		
		padre.addHijo(this);
		madre.addHijo(this);
		
		// TODO Auto-generated constructor stub
	}
	 
	 public String getGenero(){
		 return "Hombre";
	 }
}
