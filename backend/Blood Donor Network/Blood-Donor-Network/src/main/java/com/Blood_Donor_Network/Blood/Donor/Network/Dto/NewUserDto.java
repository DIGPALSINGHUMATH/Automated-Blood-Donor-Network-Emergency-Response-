package com.Blood_Donor_Network.Blood.Donor.Network.Dto;

import com.Blood_Donor_Network.Blood.Donor.Network.Eunm.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class NewUserDto {
        private  String name;
        private String email;
        private String phone;
        private String gender;
        private  String bloodGroup;
        private  int age;
        private  String address;
        private Role role;
}
