package com.Blood_Donor_Network.Blood.Donor.Network.Controler;

import com.Blood_Donor_Network.Blood.Donor.Network.Dto.NewUserDto;
import com.Blood_Donor_Network.Blood.Donor.Network.Dto.UserDto;
import com.Blood_Donor_Network.Blood.Donor.Network.Eunm.Role;
import com.Blood_Donor_Network.Blood.Donor.Network.Service.UserService;
import com.Blood_Donor_Network.Blood.Donor.Network.Service.impt.UserServiceImpt;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/User")
@CrossOrigin("*")
@RequiredArgsConstructor
public class UserControler {
    
    private final UserServiceImpt userServiceImpt;



    @GetMapping
    public ResponseEntity<List<UserDto>> getUser(){
        return ResponseEntity.ok(userServiceImpt.findAllUser());
    }
    @PostMapping
    public ResponseEntity<UserDto> newUser(@RequestBody @Valid NewUserDto newUserDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(userServiceImpt.NewUserCreated(newUserDto));
    }
    @PatchMapping("/{id}")
    public  ResponseEntity<UserDto> roleUpdate(@PathVariable Long id , @RequestBody Map<String , Object> update){
        return  ResponseEntity.ok(userServiceImpt.UpdatePartStudentById(id,update));
    }

}
