package p0010;

public class Number10 {
	static int number = 2000000;
	static long sum =0;
public static void main(String[] args) {


	for(int i=2;i<=number;i++){
		if(isPrime(i)){
			sum+=i;
		}
	}
	System.out.println(sum);
}

private static boolean isPrime(int num) {
	int input = num;
	
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
