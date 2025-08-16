package com.Blood_Donor_Network.Blood.Donor.Network.Dto;

import com.Blood_Donor_Network.Blood.Donor.Network.Eunm.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {
    private  long id;
    @NotNull
    private  String name;
    @Email
    @NotNull
    private String email;
    private String phone;
    private String gender;
    private  String bloodGroup;
    private  int age;
    private  String address;
    @Enumerated(EnumType.STRING)
    private Role role;

//    public Role setRole(){
//        return this.role;
//    }


}
