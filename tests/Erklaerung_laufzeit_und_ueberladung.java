package oop.tests;

//import static org.junit.Assert.*;
import java.awt.Color;

import oop.Astra;
import oop.Opel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * testfälle und beispiele, anhand derer man das prinzp der laufzeitpolymorhpie
 * relativ einfach erläutern kann
 * 
 * aufbauend auf {@link oop.tests.Erklaerung_typanpassung typanpassung}
 * 
 * @author SSteinkellner
 * @version 141010
 */
public class Erklaerung_laufzeit_und_ueberladung {
	Opel o, o2;
	Astra a;
	
	/*
	 * Laufzeitpolymorphie
	 * während der Laufzeit kann man Objekte in übergeordnete Objekttypen hineinschreiben,
	 * daher entscheidet sich aber auch erst während der laufzeit,
	 * von welchem typ das gespeicherte objekt wirklich ist.
	 * 
	 * Überladung
	 * dementsprechend werden dann auch die methoden ausgeführt.
	 */
	
	/**
	 * hier werden ein opel und ein opel astra erstellt
	 * so sieht es der compiler (deklarierter typ)
	 * und so ist es in dem fall auch zur laufzeit (dynamischer typ)
	 */
	@Before
	public void setup(){
		o = new Opel(2, Color.white);
		a = new Astra(22, 6, Color.red, true);
	}
	
	/**
	 * hier packe ich jetzt den astra in einen opel.
	 * da opel übergeordnet ist, ist das ohne probleme möglich.
	 * man muss nur solange der astra verpackt ist auf die funktionen und parameter verzichten,
	 * die astra mehr hat als opel
	 * 
	 * überschriebene methoden können verwendet werden, werden dann aber so ausgeführt,
	 * wie es im innersten objekt definiert ist
	 * daher sollten 2 verschieden reststände an tank überbleiben
	 */
	@Test
	public void polymorphie01(){
		o2 = (Opel) a;
		
		/* ich tanke in beide fahrzeuge 10 liter
		 * der compiler denkt, das hier wären 2 opel
		 */
		o.tanken(10);
		o2.tanken(10);

		/* da das eine auto ein durchschnittlicher opel und das andere ein astra ist,
		 * haben sie einen unterschiedlichen verbrauch auf der gleichen strecke
		 */
		o.drive(17);
		o2.drive(17);
		
		System.out.println("Debug: ("+o.getFuelLevel()+" == "+o2.getFuelLevel()+") = "
							+(o.getFuelLevel()==o2.getFuelLevel()));
		Assert.assertFalse(o.getFuelLevel()==o2.getFuelLevel());
	}
}
