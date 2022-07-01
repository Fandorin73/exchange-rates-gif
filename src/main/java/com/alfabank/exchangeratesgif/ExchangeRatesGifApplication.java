package com.alfabank.exchangeratesgif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Конфигурация для swagger.
 */
@SpringBootApplication
@EnableFeignClients
public class ExchangeRatesGifApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExchangeRatesGifApplication.class, args);
    }

}
