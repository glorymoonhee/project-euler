package p0018;

import java.util.Scanner;

public class p0018Recursion {




    public static void main(String[] args) {

          String input = "" +

                        "75 " +

                        "95 64 " +

                        "17 47 82 " +

                        "18 35 87 10 " +

                        "20 04 82 47 65 " +

                        "19 01 23 75 03 34 " +

                        "88 02 77 73 07 63 67 " +

                        "99 65 04 28 06 16 70 92 " +

                        "41 41 26 56 83 40 80 70 33 " +

                        "41 48 72 33 47 32 37 16 94 29 " +

                        "53 71 44 65 25 43 91 52 97 51 14 " +

                        "70 11 33 28 77 73 17 78 39 68 17 57 " +

                        "91 71 52 38 17 14 91 43 58 50 27 29 48 " +

                        "63 66 04 68 89 53 67 30 73 16 69 87 40 31 " +

                        "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23 " ;
          
      
           int[][] src = initInput( input, 15);

           build(src);

          

   }

   

    private static void build(int[][] src) {

           /*

           * 누적값을 저장할 2차원 배열의 값을 모두 -1로 초기화합니다.

           * 나중에 특정위치( ir, ic )의 값이 -1이 아니면 이전에 계산해 놓은 값이라고 판단하고

           * 재귀 호출을 하지 않고 sum에서 값을 꺼낸 후 반환합니다.

           */

           int [][] sum = copy( src, -1);

          

           int max = Integer.MIN_VALUE;

           /*

           * 맨 아래쪽 행(row-1)부터 재귀호출을 해서

           *

           * 가장 큰 값, 즉 root(0,0)에서 (row-1, ic) 까지의 경로 누적값이 가장 큰 값을 max에 저장함.

           *

           */
            //sum = -1
            //src 원본
           for ( int ic = 0 ; ic < src .length ; ic ++) {

                  int val = recursion( sum, src, src. length-1, ic);
                                     // -1  원본
                  if ( val > max ) {    

                        max = val;

                 }

          }

          

          System. out.println("max : " + max ); // 답출력

          

   }




    /**

    *

    * @param sum - 각 위치(r,c)에서의 누적 경로값을 기록한 배열

    * @param src - 각 위치(r,c)에서의 주어진 입력값을 갖는 배열

    * @param rowIndex - 현재 재귀호출 지점의 row

    * @param colIndex - 현재 재귀호출 지점의 col

    * @return

    */

    private static int recursion(int[][] sum,
                                       
                  int[][] src ,

                  final int rowIndex , final int colIndex) {



       if ( sum[rowIndex][colIndex] >= 0) {

               return sum[rowIndex][colIndex];

        }

          

        int left = 0;
        
        if(rowIndex -1 >=0 && colIndex -1 >=0 ){
        	
        	left = recursion(sum, src, rowIndex-1, colIndex-1);
        	
        }

         

        int right = 0;

        if ( rowIndex - 1 >= 0 && colIndex < src[ rowIndex-1]. length ) {

               // 오른족 부모가 존재하면(index 범위가 유효할경우)재귀호출

               right = recursion(sum, src, rowIndex-1, colIndex );
                 
       }


           /*

           * 왼쪽과 오른쪽 부모의 값 중 큰 값에다 자신의 값(src[ir][ic])을 더한게 현재 위치에서의

           * 최대 누적 경로값이 됨.

           */

           int max = Math.max( left, right) + src[ rowIndex][ colIndex];

           sum[ rowIndex][ colIndex] = max; // memoization

           return max ;

          

   }




    private static int[][] copy(int[][] src, int initValue ) {
          
    	 int arr[][] = new int[src.length][];
    	 
    	 for(int ir=0; ir<src.length ; ir++){
    		 arr[ir] = new int [src[ir].length];
    		  for ( int ic=0; ic<src[ir].length; ic++){
    			  arr[ir][ic] = initValue;
    		  }
    	 }
        
        return arr;

   }




    /**

    * 입력 문자열을 2차원 배열 형태로 변환해줍니다.

    * ex) "1 2 3 4 5 6"

    *

    * [

    *   [1],

    *   [2, 3]

    *   [4, 5, 6]

    * ]

    *

    * @param input

    * @param nRow

    * @return

    */

    public static int[][] initInput(String input, int nRow) {

         Scanner sc = new Scanner(input);
         int arr[][] = new int[nRow][];
         
         for(int ir=0;  ir<nRow;  ir++){
        	 arr[ir] = new int[ir+1];
        	  
        	  for(int ic=0; ic<arr[ir].length; ic++){
        		  arr[ir][ic] = sc.nextInt();
        	  }
        	  
         }
    
               return arr;
    }
}
