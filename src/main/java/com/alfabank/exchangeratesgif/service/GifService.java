package com.alfabank.exchangeratesgif.service;

import com.alfabank.exchangeratesgif.model.Gif;
import org.springframework.http.ResponseEntity;

public interface GifService {
    ResponseEntity<Gif> getGifResponse(String tag);
}
