package com.sneha.student.valueObjects;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    public Long id;
    public String name;
    public String organization;
}
