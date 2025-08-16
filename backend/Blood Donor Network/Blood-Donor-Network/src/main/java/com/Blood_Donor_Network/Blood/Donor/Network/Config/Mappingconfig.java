package com.Blood_Donor_Network.Blood.Donor.Network.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Mappingconfig {
    @Bean
    public ModelMapper modelMapper(){
        return  new ModelMapper();
    }
}
