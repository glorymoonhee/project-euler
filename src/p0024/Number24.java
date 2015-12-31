package p0024;
/**
 * 
 * [0, 1, 2, 3] = 4! 개
 *  
 *  0 - [ 1, 2, 3]   = Ptree t0 = new Ptree ( "0", [1, 2, 3]);
 *                     Ptree t00 = t0.subTree(0);   new Ptree("1", [2, 3]);
 *                                 t0.subTree(1);   new Ptree("2", [1, 3]);
 *                                 t0.subTree(2);   new Ptree("3", [1, 2]);
 *  
 *  1 - [0, 2, 3]   = new Ptree ("1", {0, 2, 3])
 *  
 *  2
 *  
 *  3
 *  
 *  4
 *  
 *  [0, ... 9 ] = 10! = 3628800
 *  
 *  0 : [1..9] = 362880
 *  1 : [0..9] = 362880
 *  2 : [0,1 - 3, 9] = 382880
 *      0 ; 40
 *      1
 *      3
 *      ...
 *      9  
 *  
 *  291030303
 *  
 *   Ptree ( 
 * @author Administrator
 *
 */
public class Number24 {

	/**
	 * 순열에서 idx 번째 순열값을 구합니다.
	 * @param root
	 * @param idx
	 * @return
	 */
	public String getPermutation ( Ptree root, int idx) {
		
		return recursion ( root, idx );
	}

	private String recursion(Ptree tree, int idx) {
		int cnt = 0; // child.countPer
		int nChild = tree.countChild(); //  3
		
	
		
		for ( int i = 0 ; i < nChild ; i++) { // 0 1 2
			Ptree child = tree.getSubTree(i);
			cnt += child.countPermutation();
			if ( cnt >= idx) {
				// idx 값이 child 안에 들어있음.
				return recursion(child, idx);
			}
			
			
		}
		   return null; 
		
	}        
}
