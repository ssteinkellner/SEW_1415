package oop.tests;

//import static org.junit.Assert.*;
import java.awt.Color;

import oop.Astra;
import oop.Opel;

import org.junit.Before;

/**
 * @author SSteinkellner
 * @version 141010
 * 
 * testf�lle und beispiele, anhand derer man das prinzp der laufzeitpolymorhpie
 * relativ einfach erl�utern kann
 * 
 * aufbauend auf {@link oop.tests.Erklaerung_typanpassung typanpassung}
 */
public class Erklaerung_laufzeit_und_ueberladung {
	/*
	 * Laufzeitpolymorphie
	 * w�hrend der Laufzeit kann man Objekte in �bergeordnete Objekttypen hineinschreiben,
	 * daher entscheidet sich aber auch erst w�hrend der laufzeit,
	 * von welchem typ das gespeicherte objekt wirklich ist.
	 * dementsprechend werden dann auch die methoden ausgef�hrt.
	 */
	
	@Before
	public void setup(){
		Opel o = new Opel(2, Color.white);
		Astra a = new Astra(22, 6, Color.red, true);
	}
}
