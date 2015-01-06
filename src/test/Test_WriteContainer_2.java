package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ssteinkellner.output.ConsoleWriter;
import ssteinkellner.output.FileWriter;
import ssteinkellner.output.WriteContainer;

public class Test_WriteContainer_2 {
	private WriteContainer wc;
	
	@Before
	public void setUp() {
		wc = new WriteContainer();
		wc.addWriter(new ConsoleWriter());
	}
	
	@Test
	public void test_listWriters(){
		assertEquals("ConsoleWriter", wc.listWriters());
	}
	
	@Test
	public void test_addAndlistWriters(){
		wc.addWriter(new FileWriter("test.txt"));
		
		assertEquals("ConsoleWriter, FileWriter", wc.listWriters());
	}
	
	@Test
	public void test_addRemoveAndlistWriters(){
		ConsoleWriter cw = new ConsoleWriter();
		wc.addWriter(cw);
		wc.removeWriter(cw);
		
		assertEquals("ConsoleWriter", wc.listWriters());
	}
	
	@Test
	public void test_addRemoveByIndexAndlistWriters(){
		ConsoleWriter cw = new ConsoleWriter();
		wc.addWriter(cw);
		wc.removeWriter(1);
		
		assertEquals("ConsoleWriter", wc.listWriters());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void test_addRemoveWrongIndexAndlistWriters(){
		ConsoleWriter cw = new ConsoleWriter();
		wc.addWriter(cw);
		wc.removeWriter(3);
	}
}
