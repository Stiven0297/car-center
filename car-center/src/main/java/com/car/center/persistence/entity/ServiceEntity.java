package com.car.center.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "servicios")
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer code;

    @Column(name = "nombre_servicio")
    private String serviceName;

    @Column(name = "precio")
    private Number price;

    @OneToMany(mappedBy = "service")
    private List<MaintenanceServicesEntity> maintenanceServices;

}
