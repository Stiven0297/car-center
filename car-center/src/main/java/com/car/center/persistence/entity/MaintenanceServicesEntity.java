package com.car.center.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "servicios_x_mantenimientos")
public class MaintenanceServicesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer code;

    @Column(name = "tiempo_estimado")
    private Integer time;

    @Column(name = "cod_servicio")
    private Integer serviceCode;

    @Column(name = "cod_mantenimiento")
    private Integer maintenanceCode;

    @ManyToOne
    @JoinColumn(name = "cod_servicio", insertable = false, updatable = false)
    private ServiceEntity service;

    @ManyToOne
    @JoinColumn(name = "cod_mantenimiento", insertable = false, updatable = false)
    private MaintenanceEntity maintenance;
}
