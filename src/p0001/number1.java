package p0001;

public class number1 {

	public static void main(String[] args) {
		System.out.println("1000까지의 3과 5의 배수의 합구하기");

		int sum = 0;

		for (int i = 0; i < 1000; i++){

			if (i % 3 == 0 || i % 5 == 0){
				sum += i;
				
			}
			// 3의배수 또는 5의배수
			// 3의배수 + 5의 배수
		}

		System.out.println(sum);

	}

}
