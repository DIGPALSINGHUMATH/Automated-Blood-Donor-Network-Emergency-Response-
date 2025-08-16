package com.Blood_Donor_Network.Blood.Donor.Network.Entity;

import com.Blood_Donor_Network.Blood.Donor.Network.Eunm.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    private String email;

    private String phone;  // Changed from int to String to support phone number formatting

    private String gender;  // Follow Java convention for variable naming

    private String bloodGroup;


    private int age;

    private String address;

    @Enumerated(EnumType.STRING)
    private Role role;



}
