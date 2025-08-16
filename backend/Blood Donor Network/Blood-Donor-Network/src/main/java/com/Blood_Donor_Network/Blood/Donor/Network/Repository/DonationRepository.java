package com.Blood_Donor_Network.Blood.Donor.Network.Repository;

import com.Blood_Donor_Network.Blood.Donor.Network.Entity.DonationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<DonationEntity , Long> {
}
