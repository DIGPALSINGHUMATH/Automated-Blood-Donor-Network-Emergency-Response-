package com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserRelatedDto;

import com.Blood_Donor_Network.Blood.Donor.Network.Dto.DonationDto;
import com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserDto;
import lombok.Data;

import java.util.List;

@Data
public class PatiantUserDto extends UserDto {

    private String Bloodgroup;
    private String urgent ;
    private long HospitalId;

    private List<DonationDto> donationDtos;

}
