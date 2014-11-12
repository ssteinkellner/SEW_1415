package ssteinkellner.calculators;

import java.util.ArrayList;
import java.util.Iterator;
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
		values = new ArrayList<Double>();
		modifier = 1.0;
		behavior = null;
	}
	
	public Calculator(CalculationBehavior cb){
		this();
		behavior = cb;
	}
	
	public void setCalculationBehavior(CalculationBehavior cb){
		behavior = cb;
	}
	
	public void addValue(double value){
		values.add(value);
	}
	
	public void removeValue(double value){
		if(values.contains(value)){
			values.remove(value);
		}
	}
	
	public void setModifier(double modifier){
		this.modifier = modifier;
	}
	
	public List<Double> prozessCalculations(){
		if(behavior==null){
			System.err.println("No calculationbehavior set. Aborting calculation!");
			return null;
		}
		
		List<Double> l = behavior.prozessCalculations(values, modifier);
		values = l;
		return l;
	}
	
	public String toString(){
		String text = "";
		Iterator<Double> i = values.iterator();
		while(i.hasNext()){
			if(text.length()>0){ text+=", "; }
			text+= ""+i.next();
		}
		return text;
	}
}
