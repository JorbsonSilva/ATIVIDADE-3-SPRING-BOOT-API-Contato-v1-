package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/contatos")
public class DemoApplication {

@GetMapping
public String listarContatos() {
    return "Lista de contatos retornada com sucesso!";
}

@PostMapping
public String criarContato() {
    return "Contato criado com sucesso!";
}

@PutMapping
public String atualizarContato() {
    return "Contato atualizado com sucesso!";
}

@DeleteMapping
public String deletarContato() {
    return "Contato deletado com sucesso!";
}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
