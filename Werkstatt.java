package oop;

import java.util.TreeMap;

/**
 * @author SSteinkellner
 * @version 141013
 *
 * @param <T> art des Autos, das die Werkstätte hauptsächlich reperieren soll
 */
public class Werkstatt <T extends Opel> {
	private TreeMap<String, Integer> kosten;
	
	public Werkstatt(){
		kosten = new TreeMap<String, Integer>();
		kosten.put("astra", 100);
		kosten.put("astra_cabrio", 130);
		kosten.put("vivaro", 110);
	}
	
	/**
	 * eine methode, die das reperieren eines autos symbolisieren soll
	 * @param auto zur reperierendes fahrzeug
	 * @return preis der reperatur oder -1, wenn das auto nicht reperiert werden kann
	 */
	public int reperatur(T auto){
		String bez = auto.getClass().getSimpleName().toLowerCase();
		
		if(bez == "astra" && ((Astra)auto).isCabrio()){
			bez = "astra_cabrio";
		}
		
		if(kosten.containsKey(bez)){
			return kosten.get(bez);
		}else{
			return -1;
		}
	}
	
	/**
	 * die werkstätte ist zwar hauptsächlich für das eine auto,
	 * macht aber in seltenen ausnahmefällen auch andere autos (dafür mit zusatzkosten)
	 * @param auto zur reperierendes fahrzeug
	 * @return preis der reperatur oder -1, wenn das auto nicht reperiert werden kann
	 */
	public <A extends Opel> int sonderReparatur(A auto){
		String bez = auto.getClass().getSimpleName().toLowerCase();
		
		if(bez == "astra" && ((Astra)auto).isCabrio()){
			bez = "astra_cabrio";
		}
		
		if(kosten.containsKey(bez)){
			return kosten.get(bez)+50;
		}else{
			return -1;
		}
	}
}
