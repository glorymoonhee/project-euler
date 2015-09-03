package p0006;

public class Number6 {
public static void main(String[] args) {
  int x = sumOFsquare(); //제곱의 합
  int y = squareOFsum(); //합의 제곱
  
  System.out.println(x);
  System.out.println(y);
  System.out.println("정답: "+ (y-x));
}

private static int squareOFsum() {
    int sum=0;
    for(int i=1;i<=100;i++){
    	sum += i;
    }
	return (int)Math.pow(sum, 2);
}

private static int sumOFsquare() {

	int sum=0;
	for(int i=1; i<=100;i++){
	sum += Math.pow(i, 2);
}
	
	return sum;
}
}
