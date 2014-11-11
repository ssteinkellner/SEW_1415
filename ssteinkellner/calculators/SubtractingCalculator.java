package ssteinkellner.calculators;

import ssteinkellner.behavior.SubtractingBehavior;

/**
 * Subtrahierender Rechner
 * <br>Setzt beim erstellen gleich das Verhalten
 * 
 * @author SSteinkellner
 * @version 2014.11.11
 */
public class SubtractingCalculator extends Calculator {
	public SubtractingCalculator(){
		super(new SubtractingBehavior());
	}
}
