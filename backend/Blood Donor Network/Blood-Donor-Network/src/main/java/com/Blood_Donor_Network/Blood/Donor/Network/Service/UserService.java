package com.Blood_Donor_Network.Blood.Donor.Network.Service;

import com.Blood_Donor_Network.Blood.Donor.Network.Dto.NewUserDto;
import com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserDto;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserDto> findAllUser();

    UserDto NewUserCreated(NewUserDto newUserDto);




    UserDto UpdatePartStudentById(Long id, Map<String, Object> update);
}
