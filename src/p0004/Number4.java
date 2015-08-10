package p0004;


public class Number4 {
	
	
	static int min = ((int)Math.pow(100, 2)); 
	static int max = ((int)Math.pow(999, 2)); 
	
public static void main(String[] args) {
  
 
     for(int i=max; i>min; i--){
    	if(IsPalindrome(i) ){
    		 
    		
    		for(int j=999; j>99 ; j--){
    			if(i%j ==0 && i/j>99 && i/j<999){
    			  System.out.println(i);//906609
    			  System.out.println(j);//993
    			  System.out.println(i/j);//913
    			   return;
    			  
    			} 
    		} 
    	   
    	}
    	}
}

private static boolean IsPalindrome(int number) { 
    
    String value = String.valueOf(number);
    int size = value.length();
 
    for(int i=0 ; i<size ; i++){
    	char a = value.charAt(i);
    	char b = value.charAt(size-1-i);
    	
    	if( a != b){
    		
    		return false;
    	}
    }     
      return true;
      
    
}
}     
      