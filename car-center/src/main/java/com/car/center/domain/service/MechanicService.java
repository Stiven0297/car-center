package com.car.center.domain.service;

import com.car.center.domain.dto.MechanicDTO;
import com.car.center.domain.repository.IMechanicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MechanicService {

    @Autowired
    private IMechanicRepository mechanicRepository;

    public List<MechanicDTO> getAll(){
        return mechanicRepository.getAll();
    }

    public List<MechanicDTO> getAllActivesMechanics(){
        return mechanicRepository.getAllActivesMechanics();
    }

    public List<MechanicDTO> getAllFreeMechanics(){
        return mechanicRepository.getAllFreeMechanics();
    }

    public MechanicDTO save(MechanicDTO mechanic){
        return mechanicRepository.save(mechanic);
    }
}
