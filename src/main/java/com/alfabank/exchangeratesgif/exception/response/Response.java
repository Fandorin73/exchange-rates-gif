package com.alfabank.exchangeratesgif.exception.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Response {
    private String message;
}
