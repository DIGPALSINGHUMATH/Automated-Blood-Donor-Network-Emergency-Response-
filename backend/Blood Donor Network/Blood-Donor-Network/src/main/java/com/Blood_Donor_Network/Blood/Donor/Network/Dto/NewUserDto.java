package com.Blood_Donor_Network.Blood.Donor.Network.Dto;


import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class NewUserDto {

        private String name;
        private String email;
        private String password;
        private String phone;
}
