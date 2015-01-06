package ssteinkellner.connection;

import java.sql.Connection;

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
			
		}
		
		return connection;
	}
}
