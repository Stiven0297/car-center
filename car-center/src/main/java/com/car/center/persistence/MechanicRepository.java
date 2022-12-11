package com.car.center.persistence;

import com.car.center.domain.dto.MechanicDTO;
import com.car.center.domain.repository.IMechanicRepository;
import com.car.center.persistence.crud.IMechanicCrudRepository;
import com.car.center.persistence.entity.MechanicEntity;
import com.car.center.persistence.mapper.IMechanicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MechanicRepository implements IMechanicRepository {

    @Autowired
    private IMechanicCrudRepository mechanicCrudRepository;

    @Autowired
    private IMechanicMapper mapper;

    @Override
    public List<MechanicDTO> getAll(){
        List<MechanicEntity> mechanics = (List<MechanicEntity>) mechanicCrudRepository.findAll();
        return mapper.toMechanicsDTO(mechanics);
    }

    @Override
    public List<MechanicDTO> getAllActivesMechanics() {
        List<MechanicEntity> mechanics = mechanicCrudRepository.getAllActivesMechanics();
        return mapper.toMechanicsDTO(mechanics);
    }

    @Override
    public List<MechanicDTO> getAllFreeMechanics() {
        List<MechanicEntity> mechanics = mechanicCrudRepository.getAllFreeMechanics();
        return mapper.toMechanicsDTO(mechanics);
    }

    @Override
    public MechanicDTO save(MechanicDTO mechanic) {
        MechanicEntity mechanicEntity = mapper.toMechanicEntity(mechanic);
        return mapper.toMechanicDTO(mechanicCrudRepository.save(mechanicEntity));
    }
}
