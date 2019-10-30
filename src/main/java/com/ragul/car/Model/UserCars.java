package com.ragul.car.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "UserCars")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserCars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 140)
    private String userName;

    @NotBlank
    @Size(max = 140)
    private String vehicleModel;

    @Size(max = 140)
    private String vehicleMake;

    private  Integer modelYear;

    @Size(max = 140)
    private String bodyType;

    private Integer engineCapacity;

    @Size(max = 140)
    private String transmission;

    @Size(max = 140)
    private String fuelType;

    @Size(max = 140)
    private String chassisNumber;

    @Size(max = 140)
    private String vehicleNumber;

    private  Integer registeredYear;

    private Integer currentMileage;

    private Integer lastEngineOilChange;

    private Integer lastEngineOilFilterChange;

    private Integer lastGearOilChange;


    //    @Size(max = 140)
//    private String description;
    @NotBlank
    @Size(max = 140)
    private String image;

}
