package p0018;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class Number18 {

    static String []message = new String[100];
    static int [][]array = null;
	
	public static void main(String[] args) throws IOException {
  
        int [][] array = fileread();
      
        
        int sum = getMax_in_Array(array);
     
        
              System.out.println(sum);
         
        
	   
	
	 }



	private static int getMax_in_Array(int[][] array) {
		int sum=0;
		int maxvalue=0;

		
          int length = array.length -1; //14
  
		  for(int i=length; i>0; i--){//14 부터 1
			   
		   for(int j=0; j<i; j++){ //array[14][0]~ array[14][14]
			   array[i-1][j] +=  Math.max(array[i][j], array[i][j+1]);
		                        
		        
			   }
			 
		 }
		return array[0][0];
	}



	private static int[][] fileread() throws NumberFormatException, IOException{
		
		   int [][]text = new int[15][];
		  File file = new File("numbers_18");
		
		   if(file.exists()){
			 System.out.println("파일존재합니다");
		    BufferedReader br = new BufferedReader(new FileReader("numbers_18"));
		      
		    String line = "";
		 
		    for(int i=0; (line=br.readLine())!=null; i++){
		    	
		            String []tmp = line.split(" ");
		      	    text[i] = new int[i+1];
		         for(int j=0; j<=i; j++){
		        	 text[i][j] = Integer.parseInt(tmp[j]);
		            
		         }
		}  
		  }
		   return text;
	}
     

 
}
