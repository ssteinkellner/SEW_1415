package ssteinkellner.calculators;

import ssteinkellner.behavior.AddingBehavior;

/**
 * Addierender Rechner
 * <br>Setzt beim erstellen gleich das Verhalten
 * 
 * @author SSteinkellner
 * @version 2014.11.11
 */
public class AddingCalculator extends Calculator {

	public AddingCalculator(){
		super(new AddingBehavior());
	}
}
