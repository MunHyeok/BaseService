package com.BaseService.Server.Database.Entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Optional;

@Entity
@Getter
@Setter
@Table(name = "users")
public class UserEntity implements IEntityClone {

    @Builder
    public UserEntity(Long id, String userID, String username, String email, String password, boolean enabled, LocalDateTime registrationDate, String phoneNumber) {
        this.id = id;
        this.userID = userID;
        this.username = username;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.registrationDate = registrationDate;
        this.phoneNumber = phoneNumber;


    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private Long id;

    @Column(name = "userid", unique = true, nullable = false)
    private String userID;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "enabled", nullable = false)
    private boolean enabled;

    @Column(name = "registration_date", nullable = false)
    private LocalDateTime registrationDate;

    @Column(name = "phone_number")
    private String phoneNumber;

    public UserEntity() {

    }

    @Override
    public void CopyFrom(Object o) {
        if(o instanceof UserEntity entity)
        {
            this.userID             = entity.userID;
            this.username           = entity.username;
            this.email              = entity.email;
            this.password           = entity.password;
            this.enabled            = entity.enabled;
            this.registrationDate   = LocalDateTime.now();
            this.phoneNumber        = entity.phoneNumber;

        }
    }


    // Getters and Setters (생략)
}
