package com.goeuro.demo;

import java.io.FileWriter;
import java.io.IOException;




import com.goeuro.demo.exceptions.BusinessException;
import com.goeuro.demo.models.City;
import com.goeuro.demo.utils.Messages;

public class CSVFileExport {
	
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	

	public static void writeCitiesToCsvFile(String fileName, String headers , City[] cities) throws BusinessException{
		
		
		FileWriter fileWriter = null;
				
		try {
			fileWriter = new FileWriter(fileName);

			//Write the CSV file header
			fileWriter.append(headers);
			
			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);
			
			//Write a new city object list to the CSV file
			for (City city : cities) {
				fileWriter.append(String.valueOf(city.getId()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(city.getName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(city.getType());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(city.getGeo_position().getLatitude()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(city.getGeo_position().getLongitude()));
				fileWriter.append(NEW_LINE_SEPARATOR);
			}


			
		} catch (Exception e) {
			throw new BusinessException(Messages.GENERAL_ERROR +" \n" + e.getMessage());
			
		} finally {
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				throw new BusinessException(Messages.GENERAL_ERROR +" \n" + e.getMessage());             
			}
			
		}
	}
}