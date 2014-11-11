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

	public DividingCalculator(){
		super(new DividingBehavior());
	}
}
