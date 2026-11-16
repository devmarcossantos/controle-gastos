package br.com.marcos.controle_gastos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController{
	
	@GetMapping("/ola")
	public String ola() {
		return "API de Controle de Gastos rodando com sucesso!!";
	}
}