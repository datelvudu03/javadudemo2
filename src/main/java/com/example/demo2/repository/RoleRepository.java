package com.example.demo2.repository;

import com.example.demo2.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    public Role findByRole(String role);
}
