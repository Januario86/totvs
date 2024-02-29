package br.com.totvs.service;

import org.springframework.stereotype.Service;

import br.com.totvs.request.ClienteRequest;

@Service
public interface ClienteService {

	Object adicionaCliente(ClienteRequest request);

}
