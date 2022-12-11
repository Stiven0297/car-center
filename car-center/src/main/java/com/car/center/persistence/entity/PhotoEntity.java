package com.car.center.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "fotos")
public class PhotoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer code;

    @Column(name = "ruta")
    private String route;

    @Column(name = "cod_mantenimiento")
    private Integer maintenanceCode;

    @ManyToOne
    @JoinColumn(name = "cod_mantenimiento", insertable = false, updatable = false)
    private MaintenanceEntity maintenance;
}
