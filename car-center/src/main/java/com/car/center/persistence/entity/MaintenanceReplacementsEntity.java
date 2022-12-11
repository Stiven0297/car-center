package com.car.center.persistence.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "servicios_x_mantenimientos")
public class MaintenanceReplacementsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer code;

    @Column(name = "unidades")
    private Integer units;

    @Column(name = "tiempo_estimado")
    private Integer time;

    @Column(name = "cod_mantenimiento")
    private Integer maintenanceCode;

    @Column(name = "cod_repuesto")
    private Integer replacementCode;

    @ManyToOne
    @JoinColumn(name = "cod_repuesto", insertable = false, updatable = false)
    private ReplacementEntity replacement;

    @ManyToOne
    @JoinColumn(name = "cod_mantenimiento", insertable = false, updatable = false)
    private MaintenanceEntity maintenance;
}
