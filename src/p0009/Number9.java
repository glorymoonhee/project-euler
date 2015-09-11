package p0009;

public class Number9 {


	public static void main(String[] args) {

		
		for(int a=1;a<1000/3;a++){//
			for(int b=a+1;b<1000/2;b++){ //500까지
		                               //a보다 b가크니까

		      int c = 1000-(a+b);
		      
		      double powA = Math.pow(a, 2);
		      double powB = Math.pow(b, 2);
		      double powC = Math.pow(c, 2);
		      
		      if(powA+powB==powC){
		           System.out.println(Math.sqrt(powA));
		           System.out.println(Math.sqrt(powB));
		           System.out.println(Math.sqrt(powC));
		           System.out.println(Math.sqrt(powA) * Math.sqrt(powB) * Math.sqrt(powC));
		      }
		          
			}
		}
		
	}
	

	

	
	
}
