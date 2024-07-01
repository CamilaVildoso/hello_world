package com.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		
		return "Hello World !!!";
	}

	@GetMapping("/bsms")
    public List<String> getBsmList() {
        return Arrays.asList(
            "Mentalidade de Crescimento",
            "Persistência",
            "Responsabilidade Pessoal",
            "Orientação ao Futuro",
            "Comunicação",
            "Proatividade",
            "Trabalho em Equipe",
            "Orientação ao Detalhe"
        );
    }
	
	@GetMapping("/objetivos")
    public List<String> getObjetivos() {
        return Arrays.asList(
            "Aprofundar conhecimentos em Spring Boot",
            "Praticar desenvolvimento de API RESTful",
            "Estudar boas práticas de código",
            "Melhorar habilidades de depuração"
        );
    }

}
