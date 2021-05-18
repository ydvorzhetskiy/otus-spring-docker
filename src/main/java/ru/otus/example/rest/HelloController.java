package ru.otus.example.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class HelloController {

    private final String hello;

    public HelloController(@Value("${application.hello-string}") String hello) {
        this.hello = hello;
    }

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Collections.singletonMap("hello", hello);
    }
}
