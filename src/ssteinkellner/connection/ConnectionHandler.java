package ssteinkellner.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ssteinkellner.Controller;

/**
 * eine klasse, die fuer das auf/abbauen von verbindungen zustaendig ist.
 * es gibt maximal eine connection.
 * @author SSteinkellner
 * @version 2014.12.30
 */
public class ConnectionHandler {
	private Connection connection;
	private UserCache usercache;
	private String host, database;
	
	public ConnectionHandler(UserCache userCache){
		usercache = userCache;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getHost() {
		return host;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getDatabase() {
		return database;
	}
	
	public Connection getConnection() {
		if(connection==null){
			connStart();
		}
		
		return connection;
	}
	

	/**
	 * loads the database driver (com.mysql.jdbc.Driver) and connects to the database. closes the programm, if there is an error
	 */
	private void connStart() {

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch(Exception ex) {
			Controller.getOutput().printError("Can't find Database driver class!");
			Controller.exit();
		}

		try {
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + host + "/" + database, usercache.getUser(), usercache.getPassword());
			Controller.getOutput().printLine("Successfully connected to " + database + " on " + host);
		} catch(SQLException ex) {
			Controller.getOutput().printError("DB connection error!");
			Controller.exit();
		}
	}
	
	public void close(){
		if(connection==null){
			try {
				connection.close();
			} catch (SQLException e) {
				Controller.getOutput().printError("Couldn't close Connection!");
			}
		}
	}

}
