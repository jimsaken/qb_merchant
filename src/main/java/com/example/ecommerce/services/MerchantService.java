package com.example.ecommerce.services;

import com.example.ecommerce.dto.MerchantDto;
import com.example.ecommerce.dto.SignInDto;
import com.example.ecommerce.entity.Merchant;

import java.util.List;

public interface MerchantService {

    String signUp(MerchantDto merchantDto);
    List<Merchant> findAll();
    Integer signIn(SignInDto signInDto);
    Boolean deleteById(String id);
    Merchant findById(String merchantId);
    Merchant findByEmail(String email);
    Merchant findByMerchantId(String merchantId);
}
