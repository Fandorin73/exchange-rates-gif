package com.alfabank.exchangeratesgif.service;

import com.alfabank.exchangeratesgif.model.Currency;
import org.springframework.http.ResponseEntity;

public interface CurrencyService {
    ResponseEntity<Currency> getCurrency(String date, String base);
}
