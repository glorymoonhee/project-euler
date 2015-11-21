package p0022;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;



public class Number22 {
	
  public static String[] NAME ;
 public static void main(String[] args) throws IOException {
	
	 
	 
     NAME = fileread();
	Arrays.sort(NAME,String.CASE_INSENSITIVE_ORDER);

	
	long allsum = 0;
	for(int i=0; i<NAME.length; i++){
		long subsum = 0;
		char[] arr = NAME[i].toCharArray();
	    for(char c : arr){
	    	subsum = 0;
	    	subsum += c - 'A' + 1;//
	    	allsum += subsum * (i+1);
	    }
	    
	}

       System.out.println(allsum);
	
 }

 









 private static String[] fileread() throws IOException {
	 String[] text = new String[5000];
	 File file = new File("p022_names.txt");
	 
	 try {
		BufferedReader br = new BufferedReader(new FileReader(file));
	    String line = br.readLine();
	    line = line.replace("\"", ""); //String              
	    text = line.split(",");
	 
	 
	 } catch (FileNotFoundException e) {
	
		e.printStackTrace();
	}
	 
	 return text;
 }



	
}
 
 
 
 

