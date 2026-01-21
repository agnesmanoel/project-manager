package com.agnes.projectmanager.models.user;
import java.time.LocalDate;

public record UserDTO (Long id, String userName, String userNumber, LocalDate userBirthDate, Boolean userHasAgreed){}