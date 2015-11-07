package p0017;

public class Number17 {
/*	1부터 5까지의 숫자를 영어로 쓰면 one, two, three, four, five 이고,
	각 단어의 길이를 더하면 3 + 3 + 5 + 4 + 4 = 19 이므로 사용된 글자는 모두 19개입니다.

	1부터 1,000까지 영어로 썼을 때는 모두 몇 개의 글자를 사용해야 할까요?

	참고: 빈 칸이나 하이픈('-')은 셈에서 제외하며, 단어 사이의 and 는 셈에 넣습니다.
	   예를 들어 342를 영어로 쓰면 three hundred and forty-two 가 되어서 23 글자,
	   115 = one hundred and fifteen 의 경우에는 20 글자가 됩니다.*/

	
// 1 2 3 4 5 6 7 8 9 	
// 11 eleven 12 twelve 13 thirteen ... ~ 19 nineteen 
// 10 20 30 40 50 60 70 80 90 
// 100 200 300 400 500 600 700 800 900
// 1000
	
	    private static final String[] A = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; 
	 	private static final String[] B = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}; 
	 	private static final String[] C = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"}; 
	 	private static final String THOUSAND = "thousand"; 
	 	private static final String HUNDRED = "hundred"; 
	 	private static final String AND = "and"; 
	 	
	 	
	 	
	 	//1 to 9
 public static void main(String[] args) {
	int sum1to9 =0;
	int sum1to99 =0;
	int sum11to20= 0;
	int sum1to999 =0;
	
	
     for(String s : A) {sum1to9 += s.length();}
	 //1~9까지
     
     for(String s : C) { sum11to20 += s.length();} 
     //10 11 12 13 14 15 16 17 18 19
      
     
     sum1to99 += sum1to9 * 9; //1~9
	 sum1to99 += sum11to20;     //10 11 12 13 14 15 16 17 18 19
	 
     for(String s: B ) { 
    	
    	 sum1to99 += s.length() * 10; 
       }
    
   //1~99까지
     
     
     
     
         
      		int value = sum1to99; 
      		value += (HUNDRED.length() + AND.length())*99; 
      		value += HUNDRED.length(); 
      		for (String s : A) 
      			sum1to999 += s.length()*100 + value; 
      		sum1to999 += sum1to99; // 1 to 99 (without any hundredth digit) 
      		 
      		
      		int thousand = A[0].length() + THOUSAND.length(); // one thousand
      		System.out.println(sum1to999 + thousand); 

     
     
     
   
     
     
     
     
     
     
     
     
     
     
     
     
}
	 	
	 	
	 	
	 	

}
