package p0020;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;



/*n! 이라는 표기법은 n × (n − 1) × ... × 3 × 2 × 1을 뜻합니다.

예를 들자면 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800 이 되는데,
여기서 10!의 각 자리수를 더해 보면 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27 입니다.

100! 의 자리수를 모두 더하면 얼마입니까*/
public class Problem20 {
  public static Map<Integer , BigInteger> cache = new HashMap<Integer, BigInteger>();
	public static void main(String[] args) {

		
		BigInteger value = factorial(100);
		//System.out.println(value);//3628800
        String s = value.toString();
		// System.out.println(s);
		 long sum=0;
		 for(int i=0;i<s.length();i++){
			    sum += s.charAt(i) - '0';
			     
		 }
		 System.out.println(sum);
		 
		
	}

	private static BigInteger factorial(int num) {
		BigInteger result = BigInteger.valueOf(0);
	  
	  
	  if(cache.get(num)==null){
		if(num==1){
			return BigInteger.valueOf(1); 
		}
		
		
		result = BigInteger.valueOf(num).multiply(factorial(num-1)); 
           cache.put(num, result);
		 return result;

	}
	  
	   return  cache.get(num);
	  }
	
}
