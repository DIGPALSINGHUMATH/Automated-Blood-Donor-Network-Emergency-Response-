package com.Blood_Donor_Network.Blood.Donor.Network.Repository;

import com.Blood_Donor_Network.Blood.Donor.Network.Entity.DonorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<DonorEntity, Long> {
}
