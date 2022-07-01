package com.alfabank.exchangeratesgif.web.v1.client;

import com.alfabank.exchangeratesgif.model.Gif;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "gif-client", url = "${gif.url}")
public interface GifClient {
    @GetMapping(value = "/random")
    ResponseEntity<Gif> getGif(@RequestParam("api_key") String api_key,
                               @RequestParam("tag") String tag);
}
