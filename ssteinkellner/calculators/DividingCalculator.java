package ssteinkellner.calculators;

import ssteinkellner.behavior.DividingBehavior;

/**
 * Dividierender Rechner
 * <br>Setzt beim erstellen gleich das Verhalten
 * 
 * @author SSteinkellner
 * @version 2014.11.11
 */
public class DividingCalculator extends Calculator {

	/**
	 * Setzt beim erstellen gleich das Verhalten auf Dividierend
	 */
	public DividingCalculator(){
		super(new DividingBehavior());
	}
}
