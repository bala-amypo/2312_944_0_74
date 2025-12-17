package com.example.demo.newentity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank


public class NewfileEntity{
    @Id
    privata Long id;
    
    privata String name;
    privata String email;
}