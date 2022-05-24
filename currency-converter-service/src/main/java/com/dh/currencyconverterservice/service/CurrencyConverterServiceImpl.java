package com.dh.currencyconverterservice.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyConverterServiceImpl implements CurrencyConverterService{
    @Override
    public Double convertCurrency(Double value, String originalCurrency, String newCurrency) {
        return value*1.1;
    }
}
