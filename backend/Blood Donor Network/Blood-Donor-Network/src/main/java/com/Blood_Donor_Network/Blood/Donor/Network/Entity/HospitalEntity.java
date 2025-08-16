package com.Blood_Donor_Network.Blood.Donor.Network.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "Hospital")
public class HospitalEntity {
    @Id
    GeneratedValue
}
