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
	 * @param wheelCount anzahl der R�der
	 * @param color farbe der Au�enhaut
	 */
	public Auto(int wheelCount, Color color){
		this.wheelCount = wheelCount;
		this.color = color;
		fuel = 0;
	}
	
	/**
	 * gibt die Anzahl der R�der zur�ck
	 * @return anzahl der R�der
	 */
	public int getWheelCount(){
		return wheelCount;
	}
	
	/**
	 * gibt die Farbe der Au�enhaut zur�ck
	 * @return farbe der Au�enhaut
	 */
	public Color getColor(){
		return color;
	}

	/**
	 * m�glichkeit den tankinhalt abzufragen
	 */
	public float getFuelLevel(){
		return fuel;
	}
	
	/**
	 * m�glichkeit den tankinhalt zu �ndern f�r alle klassen, die Auto extenden
	 * @param liter
	 */
	protected void setFuelLevel(float liter){
		fuel = liter;
	}

	/**
	 * m�glichkeit das auto eine gewisse anzahl von metern zu bewegen. der tank wird dabei weniger
	 * @param meter
	 */
	public abstract void drive(int meter);
	
	/**
	 * m�glichkeit den tank des autos aufzuf�llen
	 * @param liter
	 */
	public abstract void tanken(float liter);
}
