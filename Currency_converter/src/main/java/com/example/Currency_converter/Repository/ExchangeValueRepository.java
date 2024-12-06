package com.example.Currency_converter.Repository;

import com.example.Currency_converter.Entity.Exchange_Value;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<Exchange_Value, Long> {
    Exchange_Value findByCurrency_fromAndCurrency_to(String Currency_from, String Currency_to);

}
