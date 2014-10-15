package oop;

import java.awt.Color;

/**
 * @author Steinkellner Sebastian
 * @version 141009
 */
public class Astra extends Opel{
	private int wheelSize;
	private boolean isCabrio;
	
	/**
	 * erstellt ein neues Auto der Marke Opel vom Typ Astra
	 * @param wheelSize größe der Reifen (in Zoll)
	 * @param speakerCount Anzahl der Lautsprecher
	 * @param hasRadio information über das vorhandensein eines Radios
	 * @param color farbe der Außenhaut
	 * @param isCabrio information, ob Cabrio- oder Fix-dach
	 */
	public Astra(int wheelSize, int speakerCount, Color color, boolean isCabrio){
		super(speakerCount, color);

		this.isCabrio = isCabrio;
		this.wheelSize = wheelSize;
	}
	
	/**
	 * gibt die Größe der Räder zurück
	 * @return größe der Räder
	 */
	public int getWheelSize(){
		return wheelSize;
	}

	/**
	 * gibt true zurück, wenn das Auto ein Cabrio ist
	 * @return information ob Cabrio- oder Fix-dach
	 */
	public boolean isCabrio(){
		return isCabrio;
	}
	
	@Override
	public void drive(double kilometer){
		if(super.getFuelLevel()<=0){ return; }
		if(isCabrio){
			super.setFuelLevel(super.getFuelLevel()-kilometer/100*7);
			//7 liter auf 100 kilometer, das cabrio braucht ein bisschen mehr treibstoff
		}else{
			super.setFuelLevel(super.getFuelLevel()-kilometer/100*5);
			//5 liter auf 100 kilometer
		}
	}
}
