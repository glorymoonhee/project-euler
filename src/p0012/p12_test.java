package p0012;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class p12_test {

	@Before
	public void setUp() throws Exception {
		/*
		 * "123" + "456"
		 * [3, 2, 1]
		 * [6, 5, 4]
		 * 
		 * 
		 * BigInt num = new BigInt("3929389283983");
		 * for ( String line : allNumbers ) {
		 * 
		 * 		num = num.add ( "39389383838383");
		 * }
		 */
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
	//삼각수 구하기 
	 problem12 p12 = new problem12();
/*	 assertEquals(1,p12.getTriangleNumber(1));
	 assertEquals(3,p12.getTriangleNumber(2));
	 assertEquals(6,p12.getTriangleNumber(3));
	 assertEquals(10,p12.getTriangleNumber(4));
	 assertEquals(15,p12.getTriangleNumber(5));
	
	 */
	}
	
	@Test
	public void test_factor() {
	 problem12 p12 = new problem12();

	 int num2 = p12.getCountfactor(36); //1 2 3 4  6 9  12 18 36
	 assertEquals(9	,num2);
	 
	 assertEquals(8	,p12.getCountfactor(24));//1 2 3 4 6 8 12 24
	 assertEquals(3	,p12.getCountfactor(9));//9
	 assertEquals(4	,p12.getCountfactor(10)); //1 2 5 10
	 assertEquals(6	,p12.getCountfactor(28)); //1 2 4 7 14 28

	 
	 
	 
	 
	}

	
}
