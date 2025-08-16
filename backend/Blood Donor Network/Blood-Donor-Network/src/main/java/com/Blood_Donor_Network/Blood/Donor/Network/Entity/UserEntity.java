package com.Blood_Donor_Network.Blood.Donor.Network.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;
    private String email;
    private String password;
    private String phone;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private RoleEntity role;




}
