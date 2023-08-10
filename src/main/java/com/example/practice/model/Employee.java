package com.example.practice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//we creating a new branch3 and these branch shows 3 lines we deleted
@AllArgsConstructor//branch3
@NoArgsConstructor//branch3
public class Employee {
    
    private Integer id;//we add this for creating a new branch2
    private String name;//branch2
}
