package com.car.center.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "repuestos")
public class ReplacementEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer code;

    @Column(name = "nombre_repuesto")
    private String replacementName;

    @Column(name = "precio_unitario")
    private Number unitPrice;

    @Column(name = "unidades_inventario")
    private Integer inventoryUnits;

    @Column(name = "proveedor")
    private String provider;

    @OneToMany(mappedBy = "replacement")
    private List<MaintenanceReplacementsEntity> maintenanceReplacements;
}
