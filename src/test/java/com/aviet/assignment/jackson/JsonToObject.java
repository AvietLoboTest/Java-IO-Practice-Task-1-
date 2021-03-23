package com.aviet.assignment.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject {

	public static void main(String[] a) throws JsonMappingException, JsonProcessingException {

		Employee employee = new Employee();
		employee = getObjectData(employee);
		ObjectMapper Obj = new ObjectMapper();
		String jsonStr = Obj.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(jsonStr);
		System.out.println("Deserializing JSON to Object:");
		Employee emp = Obj.readValue(jsonStr, Employee.class);
		System.out.println(emp.getUserId() + " " + emp.getId() + " " + emp.getTitle() + " " + emp.getBody());

	}

	public static Employee getObjectData(Employee emp) {

		// Insert the data
		emp.setUserId(1);
		emp.setId(1);
		emp.setTitle("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
		emp.setBody(
				"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto");

		// Return the object
		return emp;
	}

}
