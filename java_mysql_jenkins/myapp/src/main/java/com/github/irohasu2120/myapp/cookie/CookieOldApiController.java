package com.github.irohasu2120.myapp.cookie;

import org.springframework.http.ResponseCookie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.time.Duration;

@RestController
public class CookieOldApiController {
    @GetMapping(value = "/cookie-old")
    public String doGet(HttpServletResponse response) {
        // Spring部品を使ったCookie設定
        ResponseCookie cookie = ResponseCookie.from("old-name", "takahashi")
                .domain("localhost")
                .maxAge(Duration.ofDays((long) 1))
                .httpOnly(true)
                .secure(true)
                .sameSite("Strict")
                .build();
        response.addHeader("Set-Cookie", cookie.toString());
        return "{\"result\": \"Hello World!\"}";
    }
}
