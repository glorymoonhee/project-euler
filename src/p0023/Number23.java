package p0023;
/**
 * 1. 28123이하의 초과수를 한군데 다 모아둠.
 * 
 * 2. 28123 이하의 모든 숫자들에 대해서 
 * 
 *         n0 n1 n2 n3 .... ni
 *       ----------------------------
 *    n0 |  x
 *    n1 |      x
 *    n2 |         x
 *       |
 *       |
 *       |
 *       |
 *       
 *      
 * @author Administrator
 *
 */
public class Number23 {

	private static final int number =28123;
    private static final boolean array[] = new boolean[28123 + 1];
	
	//boolean 형 배열을 만든다 - 초과수인지 아닌지 
	public static void main(String[] args) {
	   ArrayAbun();
	   int total=0;
	   for(int i=0; i<=number; i++){
		  if(!IsSumOFtwo(i)){
			total += i;
		  }
		   
	   }
	   
	   
      System.out.println(total);
	}


	private static boolean IsSumOFtwo(int num) {
	      
		for(int i=num/2 ; i>=12 ; i--){
	          if(array[i] && array[num-i]){
	        	  return true;
	          }
		}
		return false;
	}


	private static void ArrayAbun() {
              
       for(int i=12; i<= number; i++){
    	   array[i] = IsAbundant(i);
       }
		
	}


	private static boolean IsAbundant(int n) { 
		
		int sum=1;
		 int sqrt = (int)Math.sqrt(n);
		
	
		for(int i=2; i<=sqrt; i++){
			
			if(n%i==0){
				int temp = n/i;
				if(temp==sqrt){
				     sum -= sqrt;
					
				}
				
			sum += i;
			sum += n/ i;
			}
		}
		if( sum>n){
			return true; 
		 }	
		    return false;
	}
	 
	}

