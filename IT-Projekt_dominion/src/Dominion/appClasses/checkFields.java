package Dominion.appClasses;

/**
 * 
 * Pr�ft Eingaben der client_View_start Klasse
 * @author kab618
 *
 */

public class checkFields {
	private static checkFields instance = null;
	
	protected checkFields(){
		//verhindert Instanzierung
	}
		
	
	public static checkFields getInstance(){
		if(instance == null) {
			instance = new checkFields();
		}
		return instance;
		}
}
