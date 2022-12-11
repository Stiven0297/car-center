package com.car.center.web.controller;

import com.car.center.domain.dto.MechanicDTO;
import com.car.center.domain.service.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/mechanic")
public class MechanicController {

    @Autowired
    private MechanicService mechanicService;

    @GetMapping("/all")
    public ResponseEntity<List<MechanicDTO>> getAll(){
        return new ResponseEntity<>(mechanicService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/all-active")
    public ResponseEntity<List<MechanicDTO>> getAllActivesMechanics(){
        return new ResponseEntity<>(mechanicService.getAllActivesMechanics(), HttpStatus.OK);
    }

    @GetMapping("/all-free")
    public ResponseEntity<List<MechanicDTO>> getAllFreeMechanics(){
        return new ResponseEntity<>(mechanicService.getAllFreeMechanics(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<MechanicDTO> save(@RequestBody @Valid MechanicDTO mechanic){
        return new ResponseEntity<>(mechanicService.save(mechanic), HttpStatus.CREATED);
    }
}
