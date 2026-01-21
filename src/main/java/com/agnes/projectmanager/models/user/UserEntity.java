package com.agnes.projectmanager.models.user;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserEntity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String userName;
    private String userNumber;
    private LocalDate userBirthDate;
    private boolean userHasAgreed;

}