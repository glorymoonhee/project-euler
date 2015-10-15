package p0013;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Number13 {
// static BigInteger bigint = BigInteger.ZERO;
 static String[] numbers = new String[100];
 
	public static void main(String[] args) throws IOException{
         
		numbers = readfile();
		//System.out.println(numbers[0]);
		//System.out.println(numbers[1]);
		//System.out.println(numbers[2]);
		BigInteger bigint = BigInteger.ZERO;
		for(String s : numbers){
			bigint = bigint.add(new BigInteger(s));
		}
		System.out.println(bigint.toString().substring(0,10));
	
		
	}

	private static String[] readfile()throws IOException {
		String []message = new String[100];
	
		File file = new File("numbers_13");
		if(file.exists()){
			System.out.println("존재d");//왜 파일을 밖에다가 놔둬야하나요
			try {
				
				BufferedReader br = new BufferedReader(new FileReader("numbers_13"));
			      String line ="";
				for(int i=0; (line=br.readLine())!=null; i++){
					message[i] = line;
				}
	
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return message;
	}

}
