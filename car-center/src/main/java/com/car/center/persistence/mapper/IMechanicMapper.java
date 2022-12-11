package com.car.center.persistence.mapper;

import com.car.center.domain.dto.MechanicDTO;
import com.car.center.persistence.entity.MechanicEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMechanicMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "secondName", target = "secondName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "secondLastName", target = "secondLastName"),
            @Mapping(source = "cellPhone", target = "cellPhone"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "status", target = "status"),
    })
    MechanicDTO toMechanicDTO(MechanicEntity mechanic);
    List<MechanicDTO> toMechanicsDTO(List<MechanicEntity> mechanic);

    @InheritInverseConfiguration
    @Mapping(target = "maintenances", ignore = true)
    MechanicEntity toMechanicEntity(MechanicDTO mechanic);
}
