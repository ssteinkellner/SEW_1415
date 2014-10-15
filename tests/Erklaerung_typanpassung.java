package oop.tests;

import java.awt.Color;

import oop.Astra;
import oop.Opel;
import oop.Vivaro;

import org.junit.Before;
import org.junit.Test;

/**
 * @author SSteinkellner
 * @version 141015
 */
public class Erklaerung_typanpassung {

	private Opel o;
	
	@Before
	public void setup(){
		Vivaro v = new Vivaro(22, true, 12, Color.cyan);
		o = (Opel)v;
	}
	
	/*
	 * Typanpassung
	 * w�hrend der Laufzeit kann man Objekte in andere Objekte umwandeln,
	 * wenn sie vom passenden Typ sind
	 * (eigene oder �bergeordnete klasse)
	 */
	
	/**
	 * man kann einen Vivaro, der in einem Opel(�bergeordnet) verpackt ist,
	 * wieder in einen Vivaro casten.
	 */
	@Test
	public void laufzeitPolymorphie01() {
		Vivaro v = (Vivaro)o;
	}
	
	/**
	 * man kann einen Vivaro, der in einem Opel(�bergeordnet) verpackt ist,
	 * nicht in einen Astra casten, weil der Astra auf der gleichen Vererbungsebene steht.
	 * der Astra hat eigenschaften und funktionen, die der Vivaro nicht hat und umgekehrt.
	 * zb kann: * der Astra als Cabrio ausgef�hrt sein, der Vivaro (Kastenwagen) aber nicht.
	 * 			* der Vivaro als Familien- oder Transport-wagen ausgef�hrt sein.
	 */
	@Test(expected=java.lang.ClassCastException.class)
	public void laufzeitPolymorphie02() {
		Astra a = (Astra)o;
	}
	
	/**
	 * man kann eine Opel nicht in einen Astra casten,
	 * weil der Astra mehr eigenschaften/Funktionen hat, als ein Opel an sich
	 */
	@Test(expected=java.lang.ClassCastException.class)
	public void laufzeitPolymorphie03() {
		Astra a = (Astra)new Opel(4, Color.red);
	}
}
