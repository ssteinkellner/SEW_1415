package ssteinkellner.tools;

import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 * eine klasse, die allgemeine tools für das auslesen einer datenbank zur verfügung stellt
 * @author SSteinkellner
 * @version 2015.01.07
 */
public class DBTools {
	/**
	 * die methode liest aus dem resultset die spaltennamen aus und schreibt sie in eine liste
	 * @param resultset ergebnis einer sql-abfrage
	 * @return liste der spaltennamen
	 */
	public static List<String> getTableHead(ResultSet resultset){
		List<String> values = new LinkedList<String>();
		
		return values;
	}

	/**
	 * die methode liefert die daten einer tabelle als liste von string[]
	 * @param resultset ergebnis einer sql-abfrage
	 * @return daten der tabelle
	 */
	public static List<String[]> getTableData(ResultSet resultset){
		List<String[]> values = new LinkedList<String[]>();
		
		return values;
	}
}
