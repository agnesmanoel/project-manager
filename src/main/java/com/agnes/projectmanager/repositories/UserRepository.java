package com.agnes.projectmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.agnes.projectmanager.models.user.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long>{

}