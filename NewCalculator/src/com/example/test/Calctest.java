package com.example.test;


import static org.junit.Assert.*;
import com.example.classes.*;

import org.junit.Test;

public class Calctest {
	
	Calculator cal=new Calculator();

	
	
	@Test
	public void testadd(){
		assertEquals("The output of addition is :",50,cal.add(10,40));
	}
	
	@Test
	public void testmul(){
		assertEquals("The output of mul is :",400,cal.mul(10,40));
	}
	
	@Test
	public void testdiv(){
		assertEquals("The output of div is :",4,cal.div(40,10));
	}

}
