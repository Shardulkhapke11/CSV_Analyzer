package src.com.programs;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class CSVAnalyzer {

	public static void main(String args[])
	{
	    try {
	 
	        FileReader filereader = new FileReader("D:read.csv");
	        CSVReader csvReader = new CSVReader(filereader);
	        String[] nextRecord;
	 
	        while ((nextRecord = csvReader.readNext()) != null) {
				 for (String cell : nextRecord) { System.out.print(cell + " "); }
				
	            System.out.println();
	        }
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
