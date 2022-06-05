package com.alfabank.exchangeratesgif.model;

import lombok.Data;

import java.util.Map;

/**
 * Данные Курс
 */
@Data
public class Currency {
    private String disclaimer;
    private String base;
    private String license;
    private Long timestamp;
    private Map<String , Double> rates;
}
