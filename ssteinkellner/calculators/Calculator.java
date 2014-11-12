package ssteinkellner.calculators;

import java.util.List;

import ssteinkellner.behavior.CalculationBehavior;

/**
 * Die abstrakte Klasse Calculator hat die Aufgabe,
 * Werte aus einer Liste mit einem modifier zu verändern
 * und das Ergebnis als neue Liste zurück zu geben. 
 * 
 * @author SSteinkellner
 * @version 2014.11.11
 */
public class Calculator {
	protected List<Double> values;
	protected Double modifier;
	protected CalculationBehavior behavior;
	
	public Calculator(){
		
	}
	
	public Calculator(CalculationBehavior cb){
		
	}
	
	public void setCalculationBehavior(CalculationBehavior cb){
		
	}
	
	public void addValue(double value){
		
	}
	
	public void removeValue(double value){
		
	}
	
	public void setModifier(double modifier){
		
	}
	
	public List<Double> prozessCalculations(){
		return null;
	}
	
	public String toString(){
		return null;
	}
}
