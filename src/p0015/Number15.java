package p0015;

import java.util.HashMap;
import java.util.Map;
import p0015.Point;
public class Number15 {
/*
 *  (3, 3)
 *  
 * 
 * A(0,0) B(0,1) C(0,2)
 D(1,0) E(1,1) F(1,2)
 G(2,0) H(2,1) I(2,2)
 * 
 * */
	static public Map <Point,Long> map = new HashMap<Point,Long>();

	public static void main(String[] args) {


  
    long total = countPath(0,0,20,20);
    System.out.println(total);
	
	}

	private static long countPath(int irow, int icol,int x,int y) {
		long result =0;  //2,2 6  3,3 20  10,10 184756 20,20 
		   
		// 0.0 0.1 0.2 0.3
		// 1.0 1.1 1.2 1.3
		// 2.0 2.1 2.2 2.3
		// 3,0 3.1 3.2 3.3
		//map.put(new Point(irow,icol), 3);
 	     if(map.get(new Point(irow, icol))==null){ //없으면
	    	 
	     
	
		if(irow == x || icol == y){
			return 1;
		}
		
		 
		result = countPath(irow + 1, icol, x, y) + countPath( irow, icol + 1, x, y);
		  map.put(new Point(irow,icol), result);
	     return result;
	     }
	     
	     return map.get(new Point(irow, icol));
	     
	     
	 }

	


}


