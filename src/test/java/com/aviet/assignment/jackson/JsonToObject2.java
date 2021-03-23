package com.aviet.assignment.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject2 {

	public static void main(String[] a) throws JsonMappingException, JsonProcessingException {

		String jsonString = " {\r\n"
				+ "    \"userId\": 1,\r\n"
				+ "    \"id\": 1,\r\n"
				+ "    \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\r\n"
				+ "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\r\n"
				+ "  }";
		Employee employee = convertToObject(jsonString,Employee.class);
		System.out.println(employee.getTitle());

	}

	public static <T> T convertToObject(String jsonString,Class<T> clazz)
    {
        try {
        ObjectMapper mapper = new ObjectMapper();
        return (T)mapper.readValue(jsonString, clazz);
        }catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
