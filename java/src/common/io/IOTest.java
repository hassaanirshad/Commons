package common.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class IOTest{

	public static void main(String[] args) throws Exception{
		if(args.length == 0){
			System.out.println("No input files");
		}else{
			long overallStartMillis = System.currentTimeMillis();
			try{
				for(String arg : args){
					BufferedReader reader = new BufferedReader(new FileReader(new File(arg)));
					String line = null;
					while((line = reader.readLine()) != null){
						// do nothing
					}
					reader.close();
				}
			}catch(Exception e){
				// ignore
			}
			long overallEndMillis = System.currentTimeMillis();
			System.out.println("Time taken: " + (overallEndMillis - overallStartMillis) + " ms");
		}
	}
}
