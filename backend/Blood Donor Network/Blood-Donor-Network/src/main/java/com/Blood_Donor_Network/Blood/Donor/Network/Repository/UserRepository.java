package com.Blood_Donor_Network.Blood.Donor.Network.Repository;

import com.Blood_Donor_Network.Blood.Donor.Network.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
