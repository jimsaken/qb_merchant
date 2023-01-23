package com.example.ecommerce.dto;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class DisplayMerchantDto {
    private String id;
    private String name;
    private String username;
    private String email;
    private String address;
    private String phoneNumber;
    private Date createDate;
    private Date modifyDate;
}
