package com.southwind.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "my_student")
@Data
public class Student {
    @Id
    private String id;
    @Field(value = "student_age")
    private int age;
    @Field(value = "student_name")
    private String name;
}
