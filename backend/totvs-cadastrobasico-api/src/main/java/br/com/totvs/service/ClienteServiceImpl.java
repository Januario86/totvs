package br.com.totvs.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import br.com.totvs.model.Cliente;
import br.com.totvs.request.ClienteRequest;

@Service
public class ClienteServiceImpl implements ClienteService {

	private final String jsonServerUrl = "http://localhost:3000/clientes";

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Adiciona um novo cliente ao servidor JSON.
	 *
	 * Este método é responsável por enviar uma solicitação POST para adicionar um
	 * novo cliente ao servidor JSON. O cabeçalho da solicitação é configurado para
	 * indicar que o conteúdo é do tipo JSON.
	 *
	 * @param request ClienteRequest - O objeto de solicitação contendo informações
	 *                do cliente a ser adicionado.
	 * @return Cliente - O cliente adicionado, conforme retornado pelo servidor
	 *         JSON.
	 * @see ClienteRequest
	 */
	@Override
	public Object adicionaCliente(ClienteRequest request) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		return restTemplate.postForObject(jsonServerUrl, request, Cliente.class);
	}

	/**
	 * Obtém a lista de clientes do servidor JSON.
	 *
	 * Este método realiza uma solicitação GET ao servidor JSON para obter a lista
	 * de clientes. O cabeçalho da solicitação é configurado para aceitar dados no
	 * formato JSON.
	 *
	 * @return List<Cliente> - A lista de clientes obtida do servidor JSON.
	 * @see Cliente
	 */
	@Override
	public List<Cliente> obtemClientes() {
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

			ResponseEntity<List<Cliente>> responseEntity = restTemplate.exchange(jsonServerUrl,
					HttpMethod.GET, null, new ParameterizedTypeReference<List<Cliente>>() {
					});

			if (responseEntity.getStatusCode() == HttpStatus.OK) {
				return responseEntity.getBody();
			} else {
				return Collections.emptyList();
			}
		} catch (RestClientException ex) {
			return Collections.emptyList();
		}

//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//		
//		List<Cliente> clientes = restTemplate.exchange(jsonServerUrl + "/clientes", HttpMethod.GET, null,
//                new ParameterizedTypeReference<List<Cliente>>() {}).getBody();
//		return clientes;
	}

}
