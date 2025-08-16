package com.Blood_Donor_Network.Blood.Donor.Network.Dto;

import com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserRelatedDto.PatiantUserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HospitalDto {
    private Long hospitalId;

    private String name;
    private String address;
    private String contact;

    private List<Long> patientsId;
}
