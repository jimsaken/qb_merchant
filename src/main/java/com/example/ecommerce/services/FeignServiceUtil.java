package com.example.ecommerce.services;

import com.example.ecommerce.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "feignDemo", url =  "http://10.20.2.188:8080/product")
public interface FeignServiceUtil {

    @PostMapping("/add")
    ProductDto addProduct(@RequestBody ProductDto productDto);
}
