package com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserRelatedDto;

import com.Blood_Donor_Network.Blood.Donor.Network.Dto.DonationDto;
import com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserDto;

import java.util.List;

public class DonorUserDto extends UserDto {

    private String date;
    private boolean eligiblity ;

    private List<DonationDto> donations;


}
