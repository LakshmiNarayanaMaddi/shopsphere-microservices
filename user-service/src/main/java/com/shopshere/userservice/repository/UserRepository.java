package com.shopshere.userservice.repository;

import com.shopshere.userservice.entity.users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<users, UUID> {
    users findByEmail(String email);
}
