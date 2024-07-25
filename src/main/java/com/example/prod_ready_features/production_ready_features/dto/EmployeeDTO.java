package com.example.prod_ready_features.production_ready_features.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;

    private String name;

    private String email;

    private Integer age;


    private String role; //Admin,user

    private Double salary;

    private LocalDate dateOfJoining;

    private Boolean isActive;
}