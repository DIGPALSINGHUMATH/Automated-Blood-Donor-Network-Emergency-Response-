package com.Blood_Donor_Network.Blood.Donor.Network.Dto;

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
    private Long userId;
    private String name;
    @Email
    private String email;
    private String password;
    private String phone;
    private RoleDto role;
//


}
