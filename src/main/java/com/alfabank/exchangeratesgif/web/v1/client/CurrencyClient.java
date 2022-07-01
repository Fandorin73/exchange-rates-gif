package com.alfabank.exchangeratesgif.web.v1.client;

import com.alfabank.exchangeratesgif.model.Currency;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "currency-client", url = "${currency.url}")
public interface CurrencyClient {
    @GetMapping("/{date}.json")
    ResponseEntity<Currency> getCurrency(@PathVariable("date") String date,
                                         @RequestParam("app_id") String id,
                                         @RequestParam(value = "base", defaultValue = "USD") String base);
}
