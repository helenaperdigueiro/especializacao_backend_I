package com.dh.currencyconverterservice.controller;


import com.dh.currencyconverterservice.service.CurrencyConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency-converter")
public class CurrencyConverterController {

    @Autowired
    private CurrencyConverterService currencyConverterService;

    @GetMapping("/value={value}&from={originalCurrency}&to={newCurrency}")
    public Double convertCurrency(@PathVariable("value") Double value,
                                  @PathVariable("originalCurrency") String originalCurrency,
                                  @PathVariable("newCurrency") String newCurrency) {
        return currencyConverterService.convertCurrency(value, originalCurrency, newCurrency);
    }

}
