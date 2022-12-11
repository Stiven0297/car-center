package com.car.center.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "vehiculos")
public class VehicleEntity {

    @Id
    @Column(name = "placa")
    private String licensePlate;

    private String color;

    @Column(name = "cod_marca")
    private Integer brandCode;

    @Column(name = "cli_documento")
    private Integer clientDocument;

    @Column(name = "cli_tipo_documento")
    private String clientDocumentType;

    @ManyToOne
    @JoinColumn(name = "cod_marca", insertable = false, updatable = false)
    private BrandEntity brand;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "cli_documento", insertable = false, updatable = false),
        @JoinColumn(name = "cli_tipo_documento", insertable = false, updatable = false)
    })
    private ClientEntity client;

    @OneToMany(mappedBy = "vehicle")
    private List<MaintenanceEntity> maintenances;

}
