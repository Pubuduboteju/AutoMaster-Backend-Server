package com.ragul.car.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "VehicleNews")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class VehicleNews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String subTitle;

    @NotBlank
    @Size( max = 10000)
    private String description;

    @NotBlank
    private String newsDate;

    @NotBlank
    private String image;

}
