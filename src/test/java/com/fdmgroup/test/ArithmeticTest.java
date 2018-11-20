package com.fdmgroup.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.test.model.Arithmetic;

public class ArithmeticTest {
	static Arithmetic ar;
	
	@BeforeClass
	public  static void setUp(){
		ar=new Arithmetic(20,10);
	}
	
	@Before
	public void init(){
		System.out.println("Initial Stage");
		
	}
	
	@Test
	public void addTest(){
		assertEquals(30, ar.add(20,10));
		System.out.println("Changes made");
	}
	
	@Test
	public void subTest(){
		assertEquals(10, ar.subTest(20,10));
	}
	
	@After
	public void finish(){
		System.out.println("Finish!!!!");
	}
	@AfterClass
	public static void destroy(){
		System.out.println("Destroy Object!!");
	}
}
