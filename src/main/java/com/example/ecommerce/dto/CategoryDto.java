package com.example.ecommerce.dto;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
public class CategoryDto {


    //@Id
    //@Indexed(unique = true)
    private String categoryId;
    private String categoryName;
    private Boolean deleteStatus;
}