package com.example.Currency_converter.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Setter
@Getter
@ToString
public class Exchange_Value {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Currency_from;
    private String Currency_to;
    private BigDecimal Conversion_Multiple;
    private int port;

    public Exchange_Value(Long id, String currency_from, String currency_to, BigDecimal conversion_Multiple, int port) {
        this.id = id;
        Currency_from = currency_from;
        Currency_to = currency_to;
        Conversion_Multiple = conversion_Multiple;
        this.port = port;
    }

}
