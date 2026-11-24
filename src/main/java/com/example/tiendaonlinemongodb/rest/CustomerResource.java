package com.example.tiendaonlinemongodb.rest;

import com.example.tiendaonlinemongodb.model.Customer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Clientes", description = "API para la gestión de clientes")
@RequestMapping("/customers")
public interface CustomerResource {

    @Operation(summary = "Obtener todos los clientes")
    @GetMapping
    List<Customer> findAll();

    @Operation(summary = "Obtener cliente por ID")
    @GetMapping("/{id}")
    Customer findById(@PathVariable("id") String id);

    @Operation(summary = "Crear un nuevo cliente")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Customer create(@RequestBody Customer customer);

    @Operation(summary = "Actualizar cliente")
    @PutMapping("/{id}")
    Customer update(
            @PathVariable("id") String id,
            @RequestBody Customer customer
    );

    @Operation(summary = "Eliminar cliente")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable("id") String id);
}