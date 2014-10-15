package oop.tests;

//import static org.junit.Assert.*;
import java.awt.Color;

import oop.Astra;
import oop.Opel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * testf�lle und beispiele, anhand derer man das prinzp der laufzeitpolymorhpie
 * relativ einfach erl�utern kann
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
	 * w�hrend der Laufzeit kann man Objekte in �bergeordnete Objekttypen hineinschreiben,
	 * daher entscheidet sich aber auch erst w�hrend der laufzeit,
	 * von welchem typ das gespeicherte objekt wirklich ist.
	 * 
	 * �berladung
	 * dementsprechend werden dann auch die methoden ausgef�hrt.
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
	 * da opel �bergeordnet ist, ist das ohne probleme m�glich.
	 * man muss nur solange der astra verpackt ist auf die funktionen und parameter verzichten,
	 * die astra mehr hat als opel
	 * 
	 * �berschriebene methoden k�nnen verwendet werden, werden dann aber so ausgef�hrt,
	 * wie es im innersten objekt definiert ist
	 * daher sollten 2 verschieden restst�nde an tank �berbleiben
	 */
	@Test
	public void polymorphie01(){
		o2 = (Opel) a;
		
		/* ich tanke in beide fahrzeuge 10 liter
		 * der compiler denkt, das hier w�ren 2 opel
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
