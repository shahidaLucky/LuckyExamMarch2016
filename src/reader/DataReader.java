package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 */

		FileReader fr = null;
		BufferedReader br = null;
		String textFile = System.getProperty("user.dir") + "\\src\\data\\self-driving-car";
		String st = " ";

		try{
			fr = new FileReader(textFile);
			br = new BufferedReader(fr);


		}catch(Exception ex){

			//System.out.println("");
		}

		try{
			while((st=br.readLine())!=null){
				System.out.println(st);
			}
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br !=null)
					br.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}

		}
	}
}
