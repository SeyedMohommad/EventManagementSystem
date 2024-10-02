package com.ashkanamin.EMS.repository;

import com.ashkanamin.EMS.model.Role;
import com.ashkanamin.EMS.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}
