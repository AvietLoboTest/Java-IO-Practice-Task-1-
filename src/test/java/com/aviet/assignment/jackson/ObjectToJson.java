package com.aviet.assignment.jackson;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {
	public static void main(String[] a) {

		Employee employee = new Employee();

		employee = getObjectData(employee);
		ObjectMapper Obj = new ObjectMapper();

		try {

			String jsonStr = Obj.writeValueAsString(employee);

			// Displaying JSON String
			System.out.println(jsonStr);
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Get the data to be inserted into the object
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