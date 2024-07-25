package com.example.prod_ready_features.production_ready_features;

import com.example.prod_ready_features.production_ready_features.clients.EmployeeClient;
import com.example.prod_ready_features.production_ready_features.dto.EmployeeDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

}