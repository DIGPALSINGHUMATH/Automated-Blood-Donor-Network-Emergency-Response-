package com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserRelatedDto;

import com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserDto;
import com.Blood_Donor_Network.Blood.Donor.Network.Eunm.Role;

public class DonorUserDto extends UserDto {

    private String date;
    private boolean eligiblity ;

    public DonorUserDto(){
        setRole(Role.DONOR);
    }


}
