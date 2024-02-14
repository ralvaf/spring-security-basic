package com.ralva.appsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/balance")
public class BalaceController {
    @GetMapping
    public Map<String, String> balance(){
        return Collections.singletonMap("msj", "Balance");
    }
}
