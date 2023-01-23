package com.example.ecommerce.services;

import com.example.ecommerce.dto.MerchantDto;
import com.example.ecommerce.dto.SignInDto;
import com.example.ecommerce.entity.Merchant;

import java.util.List;
import java.util.Optional;

public interface MerchantService {

    public String signUp(MerchantDto merchantDto);

    public List<Merchant> findAll();

    public String signIn(SignInDto signInDto);

    public String deleteById(String id);

    public Optional<Merchant> findById(String merchantId);

    public Merchant findByMerchantId(String merchantId);
}
