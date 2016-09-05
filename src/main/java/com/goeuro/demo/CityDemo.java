package com.goeuro.demo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.goeuro.demo.exceptions.BusinessException;
import com.goeuro.demo.models.City;
import com.goeuro.demo.utils.DemoConstants;
import com.goeuro.demo.utils.Messages;

public class CityDemo {

	public static void main(String[] args) throws BusinessException  {
		if(args.length <= 0)
			throw new IllegalArgumentException(Messages.EMPTY_CITY_ARGUMENT);
		
		//get the city name argument
		String cityName = args[0];
		
		try {
			
			
			//validate the city name to be not empty string  
			if(cityName == null || cityName.isEmpty())
				throw new BusinessException(Messages.INVALID_CITY_NAME);
			
			ObjectMapper mapper = new ObjectMapper();
			//calling the api to retrieve the data
			City[] cities = mapper.readValue(new URL(DemoConstants.DEMO_URL+cityName), City[].class);
			
			//check the result of the data
			if(cities != null && cities.length >0){
				CSVFileExport.writeCitiesToCsvFile(DemoConstants.EXPORTED_FILE_NAME, DemoConstants.EXPORTED_FILE_HEADERS, cities);
				System.out.println(Messages.SUCCESS_RESULT);
			}else {
				System.out.println(Messages.NO_RESULT);
			}
		
		} catch (JsonParseException e) {
			throw new BusinessException(Messages.GENERAL_ERROR + "\n" +e.getMessage());
		} catch (JsonMappingException e) {
			throw new BusinessException(Messages.GENERAL_ERROR + "\n" +e.getMessage());
		} catch (MalformedURLException e) {
			throw new BusinessException(Messages.GENERAL_ERROR + "\n" +e.getMessage());
		} catch (IOException e) {
			throw new BusinessException(Messages.GENERAL_ERROR +" \n" + e.getMessage());
		}
	}
}
