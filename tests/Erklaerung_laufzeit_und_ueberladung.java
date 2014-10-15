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
 * testfälle und beispiele, anhand derer man das prinzp der laufzeitpolymorhpie
 * relativ einfach erläutern kann
 * 
 * aufbauend auf {@link oop.tests.Erklaerung_typanpassung typanpassung}
 */
public class Erklaerung_laufzeit_und_ueberladung {
	/*
	 * Laufzeitpolymorphie
	 * während der Laufzeit kann man Objekte in übergeordnete Objekttypen hineinschreiben,
	 * daher entscheidet sich aber auch erst während der laufzeit,
	 * von welchem typ das gespeicherte objekt wirklich ist.
	 * dementsprechend werden dann auch die methoden ausgeführt.
	 */
	
	@Before
	public void setup(){
		Opel o = new Opel(2, Color.white);
		Astra a = new Astra(22, 6, Color.red, true);
	}
}
