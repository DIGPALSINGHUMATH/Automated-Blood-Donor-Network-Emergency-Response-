package com.Blood_Donor_Network.Blood.Donor.Network.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Donations")
public class DonationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long donationId;

    private LocalDate date;
    private String status; // "PENDING", "COMPLETED", etc.

    @ManyToOne
    @JoinColumn(name = "donor_id")
    private DonorEntity donor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private PatientEntity patient;

    public void recordDonation() {
        this.status = "COMPLETED";
    }
}
