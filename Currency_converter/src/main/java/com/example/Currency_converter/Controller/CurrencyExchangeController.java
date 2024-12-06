package com.example.Currency_converter.Controller;

import com.example.Currency_converter.Entity.Exchange_Value;
import com.example.Currency_converter.Repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    ExchangeValueRepository exchangeValueRepository;

    public Exchange_Value retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {

        Exchange_Value exchangeValue = exchangeValueRepository.findByCurrency_fromAndCurrency_to(from, to);
        exchangeValue.setPort(Integer.parseInt(System.getenv("local.server.port")));
        return exchangeValue;
    }
}