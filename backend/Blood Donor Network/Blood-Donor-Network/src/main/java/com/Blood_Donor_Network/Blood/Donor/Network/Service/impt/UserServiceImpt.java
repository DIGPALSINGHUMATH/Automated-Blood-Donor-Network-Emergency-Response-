package com.Blood_Donor_Network.Blood.Donor.Network.Service.impt;

import com.Blood_Donor_Network.Blood.Donor.Network.Dto.NewUserDto;
import com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserDto;
import com.Blood_Donor_Network.Blood.Donor.Network.Entity.UserEntity;
import com.Blood_Donor_Network.Blood.Donor.Network.Repository.UserRepository;
import com.Blood_Donor_Network.Blood.Donor.Network.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class UserServiceImpt implements UserService {
    private final UserRepository userRepository;
    private final  ModelMapper modelMapper;



    @Override
    public List<UserDto> findAllUser() {
        List<UserEntity> userEntities = userRepository.findAll();

        return userEntities.stream()
                .map(userEntity -> modelMapper.map(userEntity, UserDto.class))
                .collect(Collectors.toList());

    }

    @Override
    public UserDto NewUserCreated(NewUserDto newUserDto) {
        UserEntity newuserEntity = modelMapper.map(newUserDto, UserEntity.class);
        UserEntity userEntity = userRepository.save(newuserEntity);

        return modelMapper.map( userEntity, UserDto.class);


    }
    @Override
    public UserDto UpdatePartStudentById(Long id, Map<String, Object> update) {
        UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User with ID " + id + " not found"));

        update.forEach((field, value) -> {
            switch (field) {
                case "name":
                    userEntity.setName((String) value);
                    break;
                case "email":
                    userEntity.setEmail((String) value);
                    break;
                case "phone":
                    userEntity.setPhone((String) value);
                    break;
                default:
                    System.out.println("Field " + field + " is not a valid field for update.");
                    break;
            }
        });

        UserEntity newUserEntity = userRepository.save(userEntity);
        return modelMapper.map(newUserEntity, UserDto.class);
    }



}
