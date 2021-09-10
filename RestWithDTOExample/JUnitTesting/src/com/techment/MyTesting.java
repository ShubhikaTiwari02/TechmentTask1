package com.techment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.script.ScriptAccessor.SystemPropertyAccessor;

class MyTesting {

	Calculation calculation = new Calculation();

	@Before
	void test10() {
		assertTrue(true);
		 System.out.println("before ...");

	}

	@BeforeEach
	void test11() {
		assertTrue(true);
		System.out.println("before each..");

	}

	@Test
	void test() {
		assertEquals(6, calculation.add(2, 4));
		System.out.println("test..");

	}

	@Test
	void test2() {
		assertNotEquals(6, calculation.add(2, 4));
		System.out.println("test2");

	}

	@Test
	void test3() {
		assertNotEquals(eligible,calculation.add(19));
		System.out.println("test3");

	}

	@Test
	void test4() {
		assertTrue(calculation.namecontain("d"));
		System.out.println("test4");

	}

	@Test
	void test5() {
		assertFalse(calculation.namecontain("d"));
		System.out.println("test5");

	}

	@Test
	void test6() {
		assertThrows(ArithmaticException.class, () -> {
			int a = 1;
			int b = 0;
			system.out.println(a / b);
			System.out.println("test6");

		});

	}

	@Test
	void test7() {
		assertThrows(IllegalException.class, () -> {
			IntegerParseInt("1");
		});
		System.out.println("test7");


	}

	@Test
	void test8() {
		assertThrows(IllegalException.class, () -> {
			IntegerParseInt("ab");
		});
		System.out.println("test8");


	}

}
