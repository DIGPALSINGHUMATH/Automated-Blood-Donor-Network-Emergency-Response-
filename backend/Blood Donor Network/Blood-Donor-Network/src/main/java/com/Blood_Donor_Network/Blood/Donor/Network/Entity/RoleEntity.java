    package com.Blood_Donor_Network.Blood.Donor.Network.Entity;

    import jakarta.persistence.Entity;
    import jakarta.persistence.Inheritance;
    import jakarta.persistence.InheritanceType;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;
    import jakarta.persistence.*;
    import lombok.*;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Inheritance(strategy = InheritanceType.JOINED)
    @Table(name = "Role")
    public abstract class RoleEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long roleId;

        private String roleType;

        @OneToOne
        @JoinColumn(name = "user_id")
        private UserEntity user;
    }
