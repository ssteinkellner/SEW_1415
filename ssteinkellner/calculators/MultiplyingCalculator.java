package ssteinkellner.calculators;

import ssteinkellner.behavior.MultiplyingBehavior;


/**
 * Multiplizierender Rechner
 * <br>Setzt beim erstellen gleich das Verhalten
 * 
 * @author SSteinkellner
 * @version 2014.11.11
 */
public class MultiplyingCalculator extends Calculator {

	/**
	 * Setzt beim erstellen gleich das Verhalten auf Multiplizierend
	 */
	public MultiplyingCalculator(){
		super(new MultiplyingBehavior());
	}
}
