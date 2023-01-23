package com.example.ecommerce.services;

import com.example.ecommerce.dto.StockDto;
import com.example.ecommerce.entity.Stock;

import java.util.List;

public interface StockService {

    public List<Stock> findAll();

    public Stock addStock(StockDto stockDto);

    public Stock getStock(String skuID);
}
