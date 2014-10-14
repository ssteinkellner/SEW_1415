package oop;

import java.awt.Color;

/**
 * @author Steinkellner Sebastian
 * @version 141009
 */
public class Auto {
	private int wheelCount;
	private Color color;
	
	/**
	 * erstellt ein neues Auto
	 * @param wheelCount anzahl der R�der
	 * @param color farbe der Au�enhaut
	 */
	public Auto(int wheelCount, Color color){
		this.wheelCount = wheelCount;
		this.color = color;
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
}
