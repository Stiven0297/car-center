package com.car.center.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "mantenimientos")
public class MaintenanceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer code;

    @Column(name = "estado")
    private Integer status;

    @Column(name = "cod_placa")
    private String codeLicensePlate;

    @Column(name = "fecha")
    private Date date;

    @Column(name = "mec_documento")
    private Integer mechanicDocument;

    @Column(name = "mec_tipo_documento")
    private String mechanicDocumentType;

    @ManyToOne
    @JoinColumn(name = "cod_placa", insertable = false, updatable = false)
    private VehicleEntity vehicle;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "mec_documento", insertable = false, updatable = false),
        @JoinColumn(name = "mec_tipo_documento", insertable = false, updatable = false)
    })
    private MechanicEntity mechanic;
    

    @OneToMany(mappedBy = "maintenance")
    private List<PhotoEntity> photos;

    @OneToMany(mappedBy = "maintenance")
    private List<MaintenanceReplacementsEntity> maintenanceReplacements;

    @OneToMany(mappedBy = "maintenance")
    private List<MaintenanceServicesEntity> maintenanceServices;
}
