package com.Blood_Donor_Network.Blood.Donor.Network.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientEntity extends UserEntity{

    private String requiredBlood;
    private String urgencyLevel;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private HospitalEntity hospital;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private java.util.List<DonationEntity> donations;

    public void requestBlood() {
        System.out.println("Requesting " + requiredBlood);
    }
}
