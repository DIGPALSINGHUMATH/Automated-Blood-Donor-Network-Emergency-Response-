package com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserRelatedDto;

import com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserDto;
import com.Blood_Donor_Network.Blood.Donor.Network.Eunm.Role;

public class PatiantUserDto extends UserDto {

    private String Bloodgroup;
    private String urgent ;
    private long HospitalId;

    public PatiantUserDto(){
        setRole(Role.PATIENT);
    }

}
