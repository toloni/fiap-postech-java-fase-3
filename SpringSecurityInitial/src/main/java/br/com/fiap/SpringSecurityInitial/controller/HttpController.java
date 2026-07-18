package br.com.fiap.SpringSecurityInitial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpController {

    @GetMapping("/public")
    public String publicRoute() { return "<h1>Public Route, feel free to access.</h1>"; }

    @GetMapping("/private")
    public String privateRoute() { return "<h1>Private Route, only authenticated people.</h1>"; }
}
