package com.birahim.institute.repository;

import com.birahim.institute.entities.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository <Login , Long> {

    Login findByUsername (String username);
}
