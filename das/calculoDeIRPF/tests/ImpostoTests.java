package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import calculoDeIRPF.*;


public class ImpostoTests {
	
	@Test(expected = Exception.class)
	public void testImpostoComDadosErrados() throws Exception {
		new Imposto(-1, 10, 10);
	}

}
