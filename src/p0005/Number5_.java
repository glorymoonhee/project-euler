package p0005;

public class Number5_ {
	 // 1~20까지 최대공배수 구하기
	 // 최대공배수 = 공배수 / 최대공약수
	
	
	public static void main(String[] args) {
	
	int x =1;
	
	for(int i=2;i<=20;i++){
		
		x = getlcm(x,i); 
	
	
	}
	
	System.out.println(x);
	}

	private static int getlcm(int a, int b) {
		return a*b/getgcd(a,b);
	}

	public static int getgcd(int p, int q)
	 {                        
 		if (q == 0) return p;
		return getgcd(q, p%q); 
	 }

	
	

}
