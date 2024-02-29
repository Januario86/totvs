package br.com.totvs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.totvs.model.Cliente;
import br.com.totvs.request.ClienteRequest;
@Service
public class ClienteServiceImpl implements ClienteService {

	private final String jsonServerUrl = "http://localhost:3000/clientes";
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Override
	public Object adicionaCliente(ClienteRequest request) {
		 HttpHeaders headers = new HttpHeaders();
	        headers.setContentType(MediaType.APPLICATION_JSON);
	        
		return restTemplate.postForObject(jsonServerUrl, request, Cliente.class);		
	}

}
