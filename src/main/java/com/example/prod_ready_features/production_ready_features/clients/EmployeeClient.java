package com.example.prod_ready_features.production_ready_features.clients;

import com.example.prod_ready_features.production_ready_features.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeClient {
    List<EmployeeDTO> getAllEmployees();
}