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
	
	/**
	 * erstellt einen neuen rechner ohne kalkulationsverhalten
	 */
	public Calculator(){
		values = new ArrayList<Double>();
		modifier = 1.0;
		behavior = null;
	}
	
	/**
	 * erstellt einen neuen rechner mit dem übergebenen kalkulationsverhalten
	 * @param cb neues kalkulationsverhalten
	 */
	public Calculator(CalculationBehavior cb){
		this();
		behavior = cb;
	}
	
	/**
	 * überschreibt das kalkulationsverhalten des rechners
	 * @param cb neues kalkulationsverhalten
	 */
	public void setCalculationBehavior(CalculationBehavior cb){
		behavior = cb;
	}
	
	/**
	 * fügt einen wert zur liste der werte, mit denen gerechnet werden soll hinzu
	 * @param value neuer wert
	 */
	public void addValue(double value){
		values.add(value);
	}
	
	/**
	 * entfernt einen wert aus der liste der werte, mit denen gerechnet werden soll, falls er in der liste vorhanden ist
	 * @param value zu entfernender werd
	 */
	public void removeValue(double value){
		if(values.contains(value)){
			values.remove(value);
		}
	}
	
	/**
	 * setzt den wert, mit dem alle zahlen in der  liste der werte, mit denen gerechnet werden soll, umgerechnet werden sollen
	 * @param modifier neuer modifier
	 */
	public void setModifier(double modifier){
		this.modifier = modifier;
	}
	
	/**
	 * führt die kalkulation durch, wenn ein kalkulationsverhalten gesetzt wurde
	 * @return liste der werte, die umgerechnet wurden
	 */
	public List<Double> prozessCalculations(){
		if(behavior==null){
			System.err.println("No calculationbehavior set. Aborting calculation!");
			return null;
		}
		
		List<Double> l = behavior.prozessCalculations(values, modifier);
		values = l;	//die alte liste wird überschrieben.
		return l;
	}
	
	/**
	 * erstellt eine liste aus der liste der werte, mit denen gerechnet werden soll
	 * <br>im Format: wert1, wert2, ..., wertn
	 */
	public String toString(){
		String text = "";
		Iterator<Double> i = values.iterator();
		while(i.hasNext()){
			if(text.length()>0){ text+=", "; }	//wenn der string schon einen inhalt hat, wird ein beistrich angehängt
			text+= ""+i.next();
		}
		return text;
	}
}
