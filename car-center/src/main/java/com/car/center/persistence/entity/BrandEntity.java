package com.car.center.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "marcas")
public class BrandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer code;

    @Column(name = "nombre_marca")
    private String brandName;

    @OneToMany(mappedBy = "brand")
    private List<VehicleEntity> vehicles;
}
