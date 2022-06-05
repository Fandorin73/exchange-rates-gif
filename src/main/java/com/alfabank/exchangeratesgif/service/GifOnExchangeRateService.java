package com.alfabank.exchangeratesgif.service;

import org.springframework.http.ResponseEntity;

/**
 * Сервис получения gif в зависимости от изменения курса выбранной валюты
 * @author Fandorin73
 */
public interface GifOnExchangeRateService {
    /**
     * Получють gif
     *
     * @param base
     *     - Код валюты
     * @return - gif
     */
    ResponseEntity<byte[]> getGifByCurrency(String base);
}
