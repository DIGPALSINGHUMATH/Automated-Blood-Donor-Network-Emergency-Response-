package com.Blood_Donor_Network.Blood.Donor.Network.Repository;

import com.Blood_Donor_Network.Blood.Donor.Network.Entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientEntity,Long> {
}
