package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ssteinkellner.output.DebugWriter;
import ssteinkellner.output.Writer;

public class Test_DebugWriter {
	private ByteArrayOutputStream outContent, errContent;
	private PrintStream out, err;
	private Writer w;

	@Before
	public void setUp() throws Exception {
		out = System.out;
		err = System.err;
		
		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		errContent = new ByteArrayOutputStream();
		System.setErr(new PrintStream(errContent));
	
		w = new DebugWriter();
	}

	@After
	public void tearDown() {
		System.setOut(out);
		System.setErr(err);
	}
	
	@Test
	public void test_printLine() {
		String text = "test";
		w.printLine(text);
		
		int lineNumber = 43;
		String expect = "[DEBUG]["+this.getClass().getName()+":"+lineNumber+"]\t"+text;
		
		assertEquals(expect+"\r\n",outContent.toString());
	}
	
	@Test
	public void test_printError() {
		String text = "test";
		w.printError(text);
		
		int lineNumber = 54;
		String expect = "[ERROR]["+this.getClass().getName()+":"+lineNumber+"]\t"+text;
		
		assertEquals(expect+"\r\n",errContent.toString());
	}
	
	@Test
	public void test_printException() {
		String text = "test";
		Exception e = new Exception(text);
		w.printException(e);
		
		int lineNumber = 66;
		String expect = "[EXCEPTION]["+this.getClass().getName()+":"+lineNumber+"]";
		
		assertEquals(expect+"\r\n",errContent.toString().split(""+e)[0]);
	}
}
