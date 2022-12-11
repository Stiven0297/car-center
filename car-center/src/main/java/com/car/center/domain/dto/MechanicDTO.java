package com.car.center.domain.dto;

import com.car.center.persistence.entity.MechanicPK;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class MechanicDTO {
    private MechanicPK id;

    @NotNull(message = "The firstName is required.")
    private String firstName;
    private String secondName;

    @NotNull(message = "The firstName is required.")
    private String lastName;
    private String secondLastName;

    @NotNull(message = "The firstName is required.")
    private String cellPhone;

    @NotNull(message = "The address is required.")
    private String address;
    @Email(message = "The email address is invalid.", flags = { Pattern.Flag.CASE_INSENSITIVE })
    @NotNull(message = "The email is required.")
    private String email;

    @NotNull(message = "The status is required.")
    private Character status;
}
