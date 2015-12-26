package p0025;

import java.math.BigInteger;




public class Number25_update {
      public static int nth = 0;


	public static void main(String[] args) {

		
		 BigInteger val = getFibo();

	     
		System.out.println(val); //tmp는 10을 하면 
	}

	private static BigInteger getFibo() {
	
		BigInteger f_0 = BigInteger.ONE;
		BigInteger f_1 = BigInteger.ONE;
		BigInteger tmp = BigInteger.ZERO;
	 
		int length = 0;
		
		while(true){
			
			tmp = f_0.add(f_1);
			 f_0 = f_1;
			 f_1 = tmp;
			 nth ++;
	       length = tmp.toString().length();
	       
	       
	       if(length >=1000){
	    	   System.out.println("정답"+ (nth+2) + "번째 항 입니다.");
	    	   return tmp;
	       }
			 
		}
			
			 
		
	}
}
