package org.example.service;

import org.example.model.Cliente;
import org.example.repository.ClientesRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

   /** @Autowired
    * Injeção de Independência via annotations
    private ClientesRepository repository;*/

   private ClientesRepository repository;


    /**
     * Outra forma de injeção de independência via set
    @Autowired
    public void setRepository(ClientesRepository repository) {
        this.repository = repository;
    }*/

    /**
     * Injeção de Independência via construtor
    @Autowired */
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        //ClientesRepository clientesRepository = new ClientesRepository();
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //TODO
    }
}
