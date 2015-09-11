package p0007;


public class Number7 {

	
	static int [] primes = new int[10002];
	
	public static void main(String[] args) {
		
          
   	  int i =2;
   	  int index = 0;
   	  while(true){ //9999
   		  if(index==10001){
   			  break;
   		  }
   		  
   		  if(PrimeNumber(i)){//true(소수이면)이면
   			  primes[index] = i; //primes[0] = 
   			  index ++;
              		  
   		  }
   		  i++;
   		  
   	  }
 
   System.out.println(primes[10000]);//5


}

	private static boolean PrimeNumber(int number) {//11이 들어온다.
		int input = number;
		
		if(input % 2 ==0){
			if(input/2==1){
				return true;
			}
			return false;
		} 
	for(int i=3; i*i<=input; i+=2){ //2~ 10까지 나누어지면 ㄱ
            //3~ 3<11 3 5 7 9 11		 
		if(input % i==0){  //2로나누어지면. 
			if(input/3==1){
				return true;
			}
			return false; //소수가 아니다.
		}
	}
	    
	return true;
	}
}


