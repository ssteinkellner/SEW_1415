package ssteinkellner.behavior;

import java.util.Iterator;
import java.util.List;

/**
 * subtrahierende Verhaltensweise eines rechners
 * <br> (nach strategy pattern)
 * 
 * @author SSteinkellner
 * @version 2014.11.11
 */
public class SubtractingBehavior implements CalculationBehavior{

	public <T extends Number> List<T> prozessCalculations(List<T> values, double modifier) {
		List<T> neu;
		try {
			neu = values.getClass().newInstance();
		} catch (Exception e) {
			System.err.println("Couldn't create new List. Aborting calculation!");
			return null;
		}
		
		Iterator<T> i = values.iterator();
		while(i.hasNext()){
			neu.add((T)(Number)(i.next().doubleValue() - modifier));
		}
		
		return neu;
	}
}
