package com.car.center.domain.repository;

import com.car.center.domain.dto.MechanicDTO;

import java.util.List;

public interface IMechanicRepository {

    List<MechanicDTO> getAll();

    List<MechanicDTO> getAllActivesMechanics();

    List<MechanicDTO> getAllFreeMechanics();

    MechanicDTO save(MechanicDTO mechanic);


}
