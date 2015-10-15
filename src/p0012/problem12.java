package p0012;



public class problem12 {

public static void main(String[] args) {
     
	
	int count = 1;
	 int tri =0;
	while(true){
	 //int tri = getTriangleNumber(count);
	// 1번째삼각수 1
	 // 2번째 삼각수 1+2;
	 // 3번째 삼각수 1+2+3

	 tri += count;
	 int factor = getCountfactor(tri);
	 System.out.println(tri + ": " +  factor);
	 if( factor >=500){
		 break;
	 }
	 count++;
 }	// answer : 76576500 ?

	

}



public static int getCountfactor(int t_number) { //약수의 개수 구하기
	int count = 1; //우선 1 포함
	int mok = t_number; //28
    int sqrt = (int)Math.sqrt(t_number);
	for(int i=2;i<=sqrt;i++){// 
		//제곱근까지만 살펴본다. 5까지만본다.
		
		if(mok % i ==0 ){//
		count ++; //2
	//	mok = mok / i; 
		}
	
	}
	
    //제곱근이면 2 * count - 1;
       if(Math.pow(sqrt, 2)==t_number){
    	   return 2 * count -1;
       }
	return 2 * count;
}



/*public static int getTriangleNumber(int num) {     //num번째 삼각수 구하기.

	int tri_num = (num*(num+1))/2;
	
	return tri_num;
}*/
}
