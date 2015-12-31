package p0024;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sun.applet.Main;

public class TestP0024 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		/*
		 * "" : [0, 1, 2, 3 ] = 4!
		 * "0" : [1, 2, 3] = 3!개, offset : 0 x 3!
		 * "1" : [0, 2, 3] = 3!개 , offset : 1 x 3!
		 * "2" : [0, 1, 3] = 3!개 , offset : 2 x 3!
		 * "3" : [1, 2, 3] = 3!개 , offset : 3 x 3!
		 * 
		 */
		Ptree tree = new Ptree("","0123",0);
	    assertEquals( 24 , tree.countPermutation());
	      
	    Ptree sub0 = tree.getSubTree(0);
		assertEquals ( "0", sub0.getRootString());
		assertEquals ( "123", sub0.getElemString());
		assertEquals ( 6, sub0.countPermutation());
		assertEquals ( 0, sub0.getOffset());
		
		Ptree sub1 = tree.getSubTree(1); // "1" : [0, 2, 3]
		// sub1 = new Ptree ( "1", "023", 6);
		assertEquals ( "1", sub1.getRootString());
		assertEquals ( "023", sub1.getElemString());
		assertEquals ( 6, sub1.countPermutation());
		assertEquals ( 6, sub1.getOffset());
		

	    Ptree sub10 = sub1.getSubTree(0);
	    assertEquals ( new Ptree("10", "23", 6), sub10);
	    Ptree sub11 = sub1.getSubTree(1);
	    assertEquals ( new Ptree("12", "03", 8), sub11);
	    //10 11 12 13 14 15 16 17
        
	    
		
	}
	
	@Test
	public void solve(){
		
		 
		Ptree tree = new Ptree ( "", "0123", 0);
		Number24 main = new Number24();
		/*assertEquals(4,tree.countChild());
		Ptree tree1 = new Ptree ( "1", "023", 6);
		assertEquals(3,tree1.countChild());
		Ptree tree10 = new Ptree("10", "23", 6);
		assertEquals(2, tree10.countChild());*/
		
	    String s0132 = main.getPermutation(tree, 1); // 2 번째
		assertEquals("0132", s0132);
		
		/*
		String s2310 = main.getPermutation(tree, 17); // 18번째
		assertEquals("2310", s2310); */
	}
       

}
