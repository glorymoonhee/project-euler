package p0014;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import jdk.nashorn.internal.runtime.linker.JavaAdapterFactory;

/**
 *  10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 *  
 *  // memoization 
 *  Map<Integer, Integer> cache = new ...();
 *  
 *  cache.put( 10, 6);
 *  
 *  2 : 2 -> 1 
 *  3 : 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1 ::7
 *  4 : 2 -> 1 
 *  
 */
public class P0014Main {

	static Map<Long, Integer> cache = new HashMap<Long, Integer>();
	           //key     value
	           //인덱스      카운트 수
	public static void main(String[] args) {
		long ss = 1000000L;
		int max = 0;
		for(long i=2;i<=ss; i++){
		
			int value = Collatz(i);
		 
         if(max < value){
        	 max = value;
         }
         
		}
	

		Set<Long> key = getKeysByValue(cache, max);
        System.out.println(key);
	}
	private static int Collatz(long nums) {
		long n =nums;
		int count = 0;
		while (true){
			if(cache.containsKey(n)){
				count += cache.get(n);
				cache.put(nums, count);
				return count;
			}
           if(n%2==0){ //n이 2일 때,
        	  
        	  n = n/2;
        	  
        	   if(n==1){
            	
            	    count++;
            	   cache.put(nums, count); // 10 , 6 개
            	  
            	   return count;
               }
        	  
        	  count++; 
           }else{
        	  n = n * 3 + 1;
              count++;
           }
           
      
           
		}
		
	}
	
	public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
	    Set<T> keys = new HashSet<T>();
	    for (Entry<T, E> entry : map.entrySet()) {
	        if (Objects.equals(value, entry.getValue())) {
	            keys.add(entry.getKey());
	        }
	    }
	    return keys;
	}
}
