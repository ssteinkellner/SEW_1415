package ssteinkellner.tools;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
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
	 * @throws SQLException 
	 */
	public static List<String> getTableHead(ResultSet resultset) throws SQLException{
		List<String> values = new LinkedList<String>();
		ResultSetMetaData rsmd = resultset.getMetaData();
		
		for(int i=0;i<rsmd.getColumnCount();i++){
			values.add(rsmd.getColumnName(i));
		}
		
		return values;
	}

	/**
	 * die methode liefert die daten einer tabelle als liste von string[]
	 * @param resultset ergebnis einer sql-abfrage
	 * @return daten der tabelle
	 * @throws SQLException 
	 */
	public static List<String[]> getTableData(ResultSet resultset) throws SQLException{
		List<String[]> values = new LinkedList<String[]>();
		int columnCount = resultset.getMetaData().getColumnCount();

		String[] temp;
		while(resultset.next()){
			temp = new String[columnCount];
			for(int i=0;i<columnCount;i++){
				temp[i] = resultset.getString(i);
			}
			values.add(temp);
		}
		
		return values;
	}
}
