package com.alfabank.exchangeratesgif.service.impl;

import com.alfabank.exchangeratesgif.service.GifOnExchangeRateService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Сервис получения gif в зависимости от изменения курса выбранной валюты
 * @author Fandorin73
 */
@Data
@Service
public class GifOnExchangeRateServiceImpl implements GifOnExchangeRateService {
    public ResponseEntity<byte[]> getGifByCurrency(String base) {
        return null;
    }
}
