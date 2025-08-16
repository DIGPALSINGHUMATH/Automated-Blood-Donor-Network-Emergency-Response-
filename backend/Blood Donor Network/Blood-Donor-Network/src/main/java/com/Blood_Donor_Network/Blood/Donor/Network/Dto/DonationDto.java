package com.Blood_Donor_Network.Blood.Donor.Network.Dto;

import com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserRelatedDto.DonorUserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DonationDto {
    private Long donationId;

    private LocalDate date;
    private String status;

    private Long donorId;
    private Long patientId;
}
