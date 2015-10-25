package P0016;

import java.math.BigInteger;

public class Number16 {
	static int sum = 0;
public static void main(String[] args) {
	BigInteger result ;
	BigInteger number = new BigInteger("2");
	result = number.pow(1000);

	/*char[] char_array = result.toString().toCharArray();
	for(char i : char_array){
	       String s = String.valueOf(i);
	       Integer.parseInt(s);
	       
	    		   
	}*/
	
	String s = result.toString();
	int size = s.length();
	
    for(int i=0; i<size; i++){
    	sum += s.charAt(i)-'0'; //정수로 형변환
    }
	
	System.out.println("답은"+ sum);
	
}
}
