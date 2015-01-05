package ssteinkellner.output;

/**
 * Interface fuer alle schreibenden klassen
 * <br>Strategy Pattern
 * @author SSteinkellner
 * @version 2014.12.30
 */
public interface Writer {
	public void printLine(String text);
	public void printError(String text);
	public void printException(Exception e);
}
