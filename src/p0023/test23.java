package p0023;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test23 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	  
	  int x = getSum(40);
	  assertEquals(50,x);
	  // 1 2 3 4 9 6 12 18 36 =37
	  // 1 2 3 4 6 12 = 16
	  // 1 3 9 = 4
	  // 1 2 3 4 6 8 12 24 = 36
	  // 1 2 4 5 10 20 25 50 100
	  // 1 2 4 5 8 10 20 40
	}

	private int getSum(int number) {
		
		int sum=1;
		 int sqrt = (int)Math.sqrt(number);
		
	
		 
		 
		for(int i=2; i<=sqrt; i++){
			
			if(number%i==0){
				int temp = number/i;
				if(temp==sqrt){
				     sum -= sqrt;
					
				}
				
			sum += i;
			sum += number/ i;
			}
		}
		
		return sum;
	}

}
