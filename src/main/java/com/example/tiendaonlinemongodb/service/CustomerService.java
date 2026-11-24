package com.example.tiendaonlinemongodb.service;

import com.example.tiendaonlinemongodb.model.Customer;
import com.example.tiendaonlinemongodb.repository.CustomerRepository;
import org.bson.types.ObjectId;

import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Servicio encargado de gestionar las operaciones de negocio relacionadas
 * con los clientes de la tienda online.
 *
 * <p>Esta clase actúa como intermediario entre la capa REST y la capa
 * de persistencia, delegando las operaciones de acceso a datos en
 * {@link CustomerRepository}.</p>
 *
 * @author Yeison Sanz
 * @version 1.0
 */
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;


    /**
     * Constructor del servicio de clientes.
     *
     * @param customerRepository repositorio encargado de las operaciones
     *                         de persistencia de clientes en MongoDB
     */
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Obtiene todos los clientes registrados en la base de datos.
     *
     * @return lista de clientes registrados; retorna una lista vacía
     *         si no existen clientes
     */
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    /**
     * Busca un cliente mediante su identificador de MongoDB.
     *
     * @param id identificador único del cliente
     * @return el cliente encontrado, o {@code null} si no existe
     */
    public Customer findById(ObjectId id) {
        return customerRepository.findById(id).orElse(null);
    }

    /**
     * Guarda un nuevo cliente en la base de datos.
     *
     * @param customer información del cliente que se desea guardar
     * @return el cliente persistido, incluyendo su identificador generado
     */
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    /**
     * Actualiza la información de un cliente existente.
     *
     * <p>Busca el cliente por su identificador. Si existe, conserva su ID
     * original y guarda la información actualizada. Si no existe, lanza
     * una excepción.</p>
     *
     * @param id identificador del cliente que se desea actualizar
     * @param customer objeto con la información actualizada del cliente
     * @return cliente actualizado y persistido en MongoDB
     * @throws RuntimeException si el cliente no existe en la base de datos
     */
    public Customer update(String id, Customer customer) {
        ObjectId objectId = new ObjectId(id);

        Customer existingCustomer = customerRepository.findById(objectId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        customer.setId(existingCustomer.getId());

        return customerRepository.save(customer);
    }

    /**
     * Elimina un cliente de la base de datos mediante su identificador.
     *
     * @param id identificador del cliente que se desea eliminar
     */
    public void delete(String id) {
        ObjectId objectId = new ObjectId(id);
        customerRepository.deleteById(objectId);
    }
}
