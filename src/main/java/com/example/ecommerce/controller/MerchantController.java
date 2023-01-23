package com.example.ecommerce.controller;

import com.example.ecommerce.dto.DisplayMerchantDto;
import com.example.ecommerce.dto.MerchantDto;
import com.example.ecommerce.dto.SignInDto;
import com.example.ecommerce.entity.Merchant;
import com.example.ecommerce.services.MerchantService;
import com.example.ecommerce.services.StockService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/merchant")
@RestController
public class MerchantController {
    @Autowired
    MerchantService merchantService;
    @Autowired
    StockService stockService;

    @PostMapping(value = "signUp")
    public String signUp(@RequestBody MerchantDto merchantDto) {
        return merchantService.signUp(merchantDto);
    }

    @PostMapping(value = "signIn")
    public String signIn(@RequestBody SignInDto signInDto) {
        return merchantService.signIn(signInDto);
    }

    @GetMapping(value = "displayAll")
    public List<DisplayMerchantDto> displayAll() {
        List<Merchant> merchantList = merchantService.findAll();
        List<DisplayMerchantDto> displayMerchantDtos = new ArrayList<>();
        for (Merchant merchant : merchantList) {
            DisplayMerchantDto displayMerchantDto = new DisplayMerchantDto();
            BeanUtils.copyProperties(merchant, displayMerchantDto);
            displayMerchantDtos.add(displayMerchantDto);
        }
        return displayMerchantDtos;
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public String deleteById(@PathVariable("id") String id) {
        return merchantService.deleteById(id);
    }
}
