package com.birahim.institute.repository;

import com.birahim.institute.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser, Long> {


}
