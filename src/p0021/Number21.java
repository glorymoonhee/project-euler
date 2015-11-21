package p0021;



public class Number21 {

	private static int sum =0;
  
	public static void main(String[] args) {
	  long sum = 0;

		for(int i=2; i<=10000; i++){
		// Prime(i);	
		   if (isAmicable(i)){
			   sum+= i;
		   }     	
		}
		
			System.out.println(sum);
            		
    }


	

	private static boolean isAmicable(int x) {
	    
		 int n = Prime(x);
	    	
		return Prime(n)==x && n!= x;
	}




	private static int Prime(int num) {//10 이 들어오면 소수로 
	                          //26
	    int subsum = 1;
	    int sqrt = (int)Math.sqrt(num);
	    
	    
	    
	    for(int i=2;i<sqrt;i++){
	    
	    	if(num%i==0){
	    		subsum += i;
	    		subsum += num/i; 
	    	} 
	    	
	    }
	    return subsum;
	} 
	
}
