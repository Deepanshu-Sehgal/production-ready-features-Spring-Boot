package com.example.prod_ready_features.production_ready_features.dto;


import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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