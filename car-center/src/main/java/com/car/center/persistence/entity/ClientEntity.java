package com.car.center.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "clientes")
public class ClientEntity {

    @EmbeddedId
    private ClientPK id;

    @Column(name = "primer_nombre")
    private String firstName;

    @Column(name = "segundo_nombre")
    private String secondName;

    @Column(name = "primer_apellido")
    private String lastName;

    @Column(name = "segundo_apellido")
    private String secondLastName;

    @Column(name = "celular")
    private String cellPhone;

    @Column(name = "direccion")
    private String address;

    private String email;

    @OneToMany(mappedBy = "client")
    private List<VehicleEntity> vehicles;

}
