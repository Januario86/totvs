package br.com.totvs.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.totvs.model.Cliente;
import br.com.totvs.model.Telefone;
import br.com.totvs.request.ClienteRequest;

public class ClienteServiceImplTest {

	@Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private ClienteServiceImpl clienteService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testObtemClientes() {
         List<Cliente> mockClientes = Collections.singletonList(new Cliente());
        ResponseEntity<List<Cliente>> mockResponseEntity = ResponseEntity.ok(mockClientes);
        when(restTemplate.exchange(
                ArgumentMatchers.eq("http://localhost:3000/clientes"),
                ArgumentMatchers.eq(HttpMethod.GET),
                ArgumentMatchers.isNull(),
                ArgumentMatchers.<ParameterizedTypeReference<List<Cliente>>>any()
        )).thenReturn(mockResponseEntity);

        List<Cliente> clientes = clienteService.obtemClientes();
      
        assertEquals(mockClientes, clientes);
    }

    @Test
    void testAdicionaCliente() {

        ClienteRequest clienteRequest = new ClienteRequest();
        clienteRequest.setTelefones(Collections.singletonList(new Telefone()));

        Cliente mockCliente = new Cliente();
        
        when(restTemplate.postForObject(
                ArgumentMatchers.eq("http://localhost:3000/clientes"),
                ArgumentMatchers.eq(clienteRequest),
                ArgumentMatchers.eq(Cliente.class)
        )).thenReturn(mockCliente);

        Object clienteAdicionado = clienteService.adicionaCliente(clienteRequest);

        assertEquals(mockCliente, clienteAdicionado);
    }
	
}
