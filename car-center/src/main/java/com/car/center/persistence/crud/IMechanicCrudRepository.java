package com.car.center.persistence.crud;

import com.car.center.domain.dto.MechanicDTO;
import com.car.center.persistence.entity.MechanicEntity;
import com.car.center.persistence.entity.MechanicPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IMechanicCrudRepository extends CrudRepository<MechanicEntity, MechanicPK> {

    @Query(value = "SELECT * FROM mecanicos m WHERE m.estado = 'A' LIMIT 10", nativeQuery = true)
    List<MechanicEntity> getAllActivesMechanics();

    @Query(value = "SELECT * FROM mecanicos mc WHERE NOT EXISTS (SELECT * FROM mantenimientos ma WHERE mc.documento = ma.mec_documento) LIMIT 10", nativeQuery = true)
    List<MechanicEntity> getAllFreeMechanics();
}
