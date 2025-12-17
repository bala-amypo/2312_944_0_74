package com.example.demo.newentity;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank


public class NewfileEntity{
    @Id
    @GenratedValue
    privata Long id;
    @NotBlank(message="should not contain spaces")
    privata String name;
    privata String email;
}