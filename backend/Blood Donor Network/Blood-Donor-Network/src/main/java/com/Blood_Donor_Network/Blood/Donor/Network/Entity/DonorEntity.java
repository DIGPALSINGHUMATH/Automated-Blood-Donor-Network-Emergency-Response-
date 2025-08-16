package com.Blood_Donor_Network.Blood.Donor.Network.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import static org.apache.tomcat.util.net.openssl.OpenSSLStatus.getName;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DonorEntity extends UserEntity {
    private String bloodType;
    private LocalDate lastDonate;
    private boolean availability;

    @OneToMany(mappedBy = "donor", cascade = CascadeType.ALL)
    private java.util.List<DonationEntity> donations;

    public void donateBlood() {
        this.availability = false; // after donation
    }
}
