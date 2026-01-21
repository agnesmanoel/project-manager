package com.agnes.projectmanager.models.project;

import java.time.LocalDate;
import com.agnes.projectmanager.models.user.UserDTO;

public record ProjectDTO(String projectName, LocalDate startDate, LocalDate finalDate, UserDTO responsibleUser) {

} 

