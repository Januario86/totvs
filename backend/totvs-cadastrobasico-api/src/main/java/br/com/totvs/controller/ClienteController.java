package br.com.totvs.controller;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
public class ClienteController {
	private final String jsonServerUrl = "http://localhost:3000";
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
    private MessageSource messageSource;
	
	/**
	 * Retorna a lista de clientes do servidor JSON.
	 *
	 * Este endpoint utiliza o método GET para obter a lista de clientes do servidor JSON.
	 * A anotação @CrossOrigin permite solicitações de origens diferentes.
	 *
	 * @return ResponseEntity<List<Cliente>> - Uma resposta HTTP contendo a lista de clientes.
	 * @see Cliente
	 */
	@CrossOrigin
	@GetMapping("/cliente")
	public ResponseEntity<List<Cliente>> obterClientes(){
		
		var clientes = clienteService.obtemClientes();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
		return ResponseEntity.ok(clientes);
	}
	
	/**
	 * Adiciona um novo cliente ao servidor JSON.
	 *
	 * Este endpoint utiliza o método POST para adicionar um novo cliente ao servidor JSON.
	 * A anotação @CrossOrigin permite solicitações de origens diferentes.
	 *
	 * @param request ClienteRequest - O objeto de solicitação contendo informações do cliente a ser adicionado.
	 * @return ResponseEntity<String> - Uma resposta HTTP indicando o status da operação de adição de cliente.
	 *                                Retorna uma mensagem de sucesso ao criar o cliente.
	 * @see ClienteRequest
	 */
	@CrossOrigin
	@PostMapping("/cliente")
	public ResponseEntity<String> adicionaCliente(@RequestBody ClienteRequest request){
		var cliente = clienteService.adicionaCliente(request);
		return ResponseEntity.status(HttpStatus.CREATED).body(messageSource.getMessage("Adicionar.cliente", null, Locale.getDefault()));
	}
}
