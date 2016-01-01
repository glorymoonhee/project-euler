package p0028;

public class Number28 {

	
        public static void main(String[] args) {
		
        	int center = 1001 /2 ;
     
        	
        	int subtotal = 1;
        	int sum = subtotal;
        	
        	for(int i=1; i<=center; i++){
        		    int v=  2 * i;
        		 for(int j=0; j<4; j++){
        			  subtotal += v;
        			  sum += subtotal;
        			  
        		 }
        		
        	}
        	
        	System.out.println(sum);
        	
		}
}
