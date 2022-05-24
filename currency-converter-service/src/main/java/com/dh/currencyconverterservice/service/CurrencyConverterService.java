package com.dh.currencyconverterservice.service;

public interface CurrencyConverterService {
    Double convertCurrency(Double value, String originalCurrency, String newCurrency);
}
