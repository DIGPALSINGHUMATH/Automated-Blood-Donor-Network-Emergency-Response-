package com.Blood_Donor_Network.Blood.Donor.Network.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Hospitals")
public class HospitalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hospitalId;

    private String name;
    private String address;
    private String contact;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
    private java.util.List<PatientEntity> patients;

    public void verifyRequest() {}
    public void manageStock() {}
}
