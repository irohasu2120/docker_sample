package com.github.irohasu2120.myapp.cookie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class CookieApiController {

    @GetMapping(value = "/cookie")
    public String doGet(HttpServletResponse response) {
        // HttpServletResponseを使ったCookie設定
        String cookie = String.format("%s=%s; max-age=3600; Path=/; HttpOnly; Secure; SameSite=Strict;", "name", "Yamada");

        response.addHeader("Set-Cookie", cookie);
        return "{\"result\": \"Hello World!\"}";
    }
}
