package com.ragul.car.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Exterior")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Exterior {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleModel;
    private Boolean powerMirrors;
    private Boolean heatedMirrors;
    private Boolean autoRectractableMirrors;

    private Boolean rearWiper;
    private Boolean rainSensingWipers;

    private Boolean scoopHeadlamps;
    private Boolean LEDHeadlamps;
    private Boolean turningSequentialLights;
    private Boolean fogLamps;
    private Boolean LEDTailLights;

    private String wheelSize;
    private String tyreSize;
    private Boolean alloyWheels;

    private Boolean nickelDoorHandles;
    private Boolean sunroof;
    private Boolean frontBumperRearBumperNickleBodyDesign;
    private Boolean sideNickleBeadings;
    private Boolean rearSpoiler;
}
