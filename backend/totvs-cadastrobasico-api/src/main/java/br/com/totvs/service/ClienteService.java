package br.com.totvs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.totvs.model.Cliente;
import br.com.totvs.request.ClienteRequest;

@Service
public interface ClienteService {

	Object adicionaCliente(ClienteRequest request);

	List<Cliente> obtemClientes();

}
