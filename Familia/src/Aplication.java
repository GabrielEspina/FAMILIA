import ar.edu.ub.p3.familia.*;
import ar.edu.ub.p3.persona.Persona;

public class Aplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//ABUELOS
		Persona abueloPapa	= Persona.construirHombre( Familiar.ABUELO );
		Persona	abuelaPapa	= Persona.construirMujer ( Familiar.ABUELA );
		
		Persona abueloMama	= Persona.construirHombre( Familiar.ABUELO );
		Persona	abuelaMama	= Persona.construirMujer ( Familiar.ABUELA );
		
		//PADRES
		Persona padre 	= Persona.construirHombre( Familiar.PADRE , abueloPapa , abuelaPapa );
		Persona madre 	= Persona.construirMujer ( Familiar.MADRE , abueloMama , abuelaMama );
		
		//ME CREO A MI
		Persona yo	  	= Persona.construirHombre( Familiar.YO , padre , madre );
		
		//HERMANOS
		Persona hermano	= Persona.construirHombre( Familiar.HERMANO , padre , madre );
		Persona hermana = Persona.construirMujer ( Familiar.HERMANA , padre , madre );
		
		//TIOS
		Persona tio		= Persona.construirHombre( Familiar.TIO , abueloPapa , abuelaPapa);
		Persona tia		= Persona.construirMujer( Familiar.TIA , abueloPapa , abuelaPapa);
		
		//PRIMOS
		Persona primo	= Persona.construirHombre( Familiar.PRIMO , tio , tia);
		Persona	prima	= Persona.construirMujer ( Familiar.PRIMA , tio , tia);
		
		
		
		//EJEMPLOS DE CONSULTAS DESDE MI PERSONA------------------------------------------------------
		
		//MI PADRE
		System.out.println(yo.getPadre().getFamiliar());
		
		//MI ABUELO DE PARTE DE MI PADRE
		System.out.println(yo.getPadre().getPadre().getFamiliar());
		
		//MI ABUELA DE PARTE DE MI MADRE
		System.out.println(yo.getMadre().getMadre().getFamiliar());
		
		//MI TIO
		System.out.println(yo.getPadre().getPadre().getHijos().getLast().getFamiliar());
		
		//MIS PRIMOS
		System.out.println(yo.getPadre().getPadre().getHijos().getLast().getHijos().getFirst().getFamiliar());
		System.out.println(yo.getPadre().getPadre().getHijas().getLast().getHijas().getFirst().getFamiliar());
	}

}
