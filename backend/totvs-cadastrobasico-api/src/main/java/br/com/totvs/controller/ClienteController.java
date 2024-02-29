package br.com.totvs.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.totvs.model.Cliente;
import br.com.totvs.request.ClienteRequest;
import br.com.totvs.service.ClienteService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ClienteController {
	private final String jsonServerUrl = "http://localhost:3000";
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/cliente")
	public ResponseEntity<List<Cliente>> obterClientes(){
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
		List<Cliente> clientes = restTemplate.exchange(jsonServerUrl + "/clientes", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Cliente>>() {}).getBody();

        return ResponseEntity.ok(clientes);
	}	
	
	@PostMapping("/cliente")
	public ResponseEntity<String> adicionaCliente(@RequestBody ClienteRequest request){
		var resultado = clienteService.adicionaCliente(request);
		return ResponseEntity.status(HttpStatus.CREATED).body("TESTE");
	}
}
