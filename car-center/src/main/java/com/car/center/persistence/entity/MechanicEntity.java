package com.car.center.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "mecanicos")
public class MechanicEntity implements Serializable {

    @EmbeddedId
    private MechanicPK id;

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

    @Column(name = "estado")
    private Character status;

    @OneToMany(mappedBy = "mechanic")
    private List<MaintenanceEntity> maintenances;

}
