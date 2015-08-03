package p0002;

public class number2 {

	public static void main(String[] args) {
	
		long result = getFibo(); 
		System.out.println(result);
	}

	private static long getFibo() {
		 
	   
	     long n_2 = 1;   //첫번째 값을 설정
	     long n_1 = 2; 
	     long temp = 0;
	     long sum =0;
	     long max = 4000000;

        while(n_2<max){
        	    temp= n_2 + n_1;
                n_2 = n_1;
                n_1 = temp;
        	   
                if(n_2%2==0){
                	sum += n_2;
                }
        }
	     
	      return sum;
	         
	}
	
}
