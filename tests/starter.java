package oop.tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class starter {
	public static void main(String[] args) {
		
		System.out.println("Testing OOP \n(Möglicher output des programms folgt jetzt)\n");
		
		Result result = JUnitCore.runClasses(Erklaerung_typanpassung.class,
				Erklaerung_generizitaet.class,
				Erklaerung_laufzeit_und_ueberladung.class);

		System.out.println("\n" + result.getRunCount() + " Tests"
				+ " in " + result.getRunTime() + " milliseconds");
		
		if(result.getFailureCount()>0){
			System.out.println("Testing Failures:");
			for (Failure failure : result.getFailures()) {
				System.out.println(failure.getTestHeader() +"\n"+ failure.getTrace());
			}
		}
	}
}
