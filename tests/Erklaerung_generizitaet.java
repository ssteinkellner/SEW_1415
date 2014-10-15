package oop.tests;

import java.awt.Color;

import oop.Astra;
import oop.Vivaro;
import oop.Werkstatt;

import org.junit.Before;
import org.junit.Test;

/**
 * testfälle und beispiele, anhand derer man das prinzp der generizität relativ einfach erläutern kann
 * 
 * aufbauend auf {@link oop.tests.Erklaerung_typanpassung typanpassung}
 * 
 * @author SSteinkellner
 * @version 141015
 */
public class Erklaerung_generizitaet {
	Werkstatt<Astra> w;

	/**
	 * eine neue werkstatt wird erstellt und durch einen generischen typ
	 * als Astra werkstatt definiert
	 */
	@Before
	public void setup() {
		w = new Werkstatt<Astra>();
	}
	
	/*
	 * bei generiztät muss man unterscheiden zwischen generischen klassen und generschen methoden.
	 * generische klassen haben eine oder mehrere definierte generische typen, die dann auch in den
	 * meisten methoden verwendet werden.
	 * bei generischen methoden wird der generische typ nur innerhalb der methode verwendet.
	 * das macht sinn, wenn man viel hin und her castet (laufzeitpolymorphie)
	 * 	um fehlermöglichkeiten zu reduzieren
	 */
	
	/**
	 * einen Astra kann man ohne probleme in dieser werkstatt reparieren lassen
	 * 
	 * hier ist die methode bereits generisch, da der generische typ der klasse verwendet wird
	 */
	@Test
	public void generizitaet01(){
		Astra a = new Astra(4, 6, Color.red, true);
		w.reperatur(a);
	}
	
	/**
	 * einen Vivaro kann man für eine sonderreperatur in die werkstatt stellen,
	 * da es die möglichkeit einer sonderreperatur in ausnahmefällen gibt
	 * 
	 * hier wird ein generischer typ angegeben, da die klasse einen anderen generischen typ definiert hat
	 */
	@Test
	public void generizitaet02(){
		Vivaro v = new Vivaro(22, true, 12, Color.cyan);
		w.<Vivaro>sonderReparatur(v);
	}
}
