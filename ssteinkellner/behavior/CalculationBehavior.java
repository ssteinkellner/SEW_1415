package ssteinkellner.behavior;

import java.util.List;

/**
 * Interface für alle verhaltensweisen eines rechners
 * <br> (nach strategy pattern)
 * 
 * @author SSteinkellner
 * @version 2014.11.11
 */
public interface CalculationBehavior {
	
	/**
	 * rechnet jeden wert der Liste mit dem modifier um
	 * @param values liste der Werte zur umrechnung
	 * @param modifier wert zum umrechnen
	 * @return umgerechnete Liste der Werte
	 */
	public List prozessCalculations(List values, double modifier);
}
