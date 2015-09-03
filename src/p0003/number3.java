package p0003;

import java.util.ArrayList;
/**
 * 주어진 수를 구성하는 소인수 중에 가장 큰 소수를 구하라.
 * 
 * 10 = 2 * 5   :5
 * 100 = 2 * 2 * 5 * 5   ::5
 * 
 * 1000 = 
 * @author Administrator
 *
 */
public class number3 {


   	 
	public static void main(String[] args) {
           
	//	long input = 600851475143L;
	//	long answer = input;
      long input = 600851475143L;
      long answer = 0L;
      
      answer = MaxPrimeNumber(input);
		System.out.println(answer);
	
		
	}

	private static long MaxPrimeNumber(long value) {
		
		long divider = 2L;
		long maxPrime = 0L;
		long input = value;
         
         while(true){ 
        	  // 600851475143L / 2L ==1 && 
        	 if(input / divider ==1 && input % divider==0){
        		 maxPrime =divider;
        		 break;
        	 }
        	 
		if(input % divider !=0){
			divider++;
		}else if(input %  divider ==0){
			input /= divider;
			maxPrime = divider;
		}
         }//while 문 끝
		
         return maxPrime;
	}
	
	/*
	 *    maxPrime = 29;
	 *    INPUT: 13195   divider: 2
	 *    13195 % divider != 0    divider ++;
	 *    13195 % divider != 0    divider ++; // 4
	 *    13195 % divider != 0    divider ++; // 5
	 *    13195 % divider ==0     INPUT /= divider
	 *    
	 *    2639  % divider != 0    divider ++ ; // 6;
	 *    2639 % divider != 0     divider ++ ; // 7
	 *    2639 % divider == 0     INPUT /= divider; // 377
	 *    
	 *    377 % divider           divider += 2 // 9
	 *    
	 *    377 % div               INPUT /= div; // 29
	 *    
	 *    29 % div                INPuT /= div // 1 break;
	 *    
	 */

  
		     
}



