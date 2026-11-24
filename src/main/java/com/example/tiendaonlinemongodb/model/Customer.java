package com.example.tiendaonlinemongodb.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Document(collection = "clientes")
public class Customer {

    @Id
    private ObjectId id;

    @Schema(description = "Nombre completo del cliente")
    private String nombre;

    @Schema(description = "Correo electronico")
    private String correo;

    @Schema(description = "edad")
    private int edad;

    @Schema(description = "ciudad")
    private String ciudad;

    @Schema(description = "estado")
    private boolean activo;

    @Schema(description = "fecha de registro")
    private LocalDateTime fechaRegistro;

}
