package com.example.prod_ready_features.production_ready_features;

import com.example.prod_ready_features.production_ready_features.clients.EmployeeClient;
import com.example.prod_ready_features.production_ready_features.dto.EmployeeDTO;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
class ProductionReadyFeaturesApplicationTests {

	@Autowired
	private EmployeeClient employeeClient;

	@Test
	void getAllEmployees(){
		List<EmployeeDTO> employeeDTOList = employeeClient.getAllEmployees();
		System.out.println(employeeDTOList);
	}

	@Test
	@Order(2)
	void getEmployeeByIdTest() {
		EmployeeDTO employeeDTO = employeeClient.getEmployeeById(100L);
		System.out.println(employeeDTO);
	}

	@Test
	@Order(1)
	void createNewEmployeeTest() {
		EmployeeDTO employeeDTO = new EmployeeDTO(null, "Deepanshu", "deepanshu@gmail.com", 2,
				"USER", 5000.0, LocalDate.of(2020, 12, 1), true);
		EmployeeDTO savedEmployeeDTO = employeeClient.createNewEmployee(employeeDTO);
		System.out.println(savedEmployeeDTO);
	}

}