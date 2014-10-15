package oop;

import java.awt.Color;

/**
 * @author Steinkellner Sebastian
 * @version 141009
 */
public abstract class Auto {
	private int wheelCount;
	private Color color;
	private float fuel;
	
	/**
	 * erstellt ein neues Auto
	 * @param wheelCount anzahl der Räder
	 * @param color farbe der Außenhaut
	 */
	public Auto(int wheelCount, Color color){
		this.wheelCount = wheelCount;
		this.color = color;
		fuel = 0;
	}
	
	/**
	 * gibt die Anzahl der Räder zurück
	 * @return anzahl der Räder
	 */
	public int getWheelCount(){
		return wheelCount;
	}
	
	/**
	 * gibt die Farbe der Außenhaut zurück
	 * @return farbe der Außenhaut
	 */
	public Color getColor(){
		return color;
	}

	/**
	 * möglichkeit den tankinhalt abzufragen
	 */
	public float getFuelLevel(){
		return fuel;
	}
	
	/**
	 * möglichkeit den tankinhalt zu ändern für alle klassen, die Auto extenden
	 * @param liter
	 */
	protected void setFuelLevel(float liter){
		fuel = liter;
	}

	/**
	 * möglichkeit das auto eine gewisse anzahl von metern zu bewegen. der tank wird dabei weniger
	 * @param meter
	 */
	public abstract void drive(int meter);
	
	/**
	 * möglichkeit den tank des autos aufzufüllen
	 * @param liter
	 */
	public abstract void tanken(float liter);
}
