package com.alfabank.exchangeratesgif.controller;

import com.alfabank.exchangeratesgif.service.GifOnExchangeRateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер получения gif в зависимости от изменения курса выбранной валюты
 * @author Fandorin73
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ExchangeRateController {

    private final GifOnExchangeRateService gifOnExchangeRate;

    @GetMapping("/gif")
    public ResponseEntity<byte[]> getGifByCurrency(@RequestParam("base") String base) {
        return gifOnExchangeRate.getGifByCurrency(base);
    }

    @GetMapping("/*")
    public ResponseEntity<byte[]> getGifByCurrency() {
        return gifOnExchangeRate.getGifByCurrency("USD");
    }
}
