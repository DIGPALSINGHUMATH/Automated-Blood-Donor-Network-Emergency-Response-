package com.Blood_Donor_Network.Blood.Donor.Network.Service;

import com.Blood_Donor_Network.Blood.Donor.Network.Dto.NewUserDto;
import com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findAllUser();

    UserDto NewUserCreated(NewUserDto newUserDto);


    UserDto upadateRole(Long id, String role);
}
