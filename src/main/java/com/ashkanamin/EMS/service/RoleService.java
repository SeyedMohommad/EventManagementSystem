package com.ashkanamin.EMS.service;

import com.ashkanamin.EMS.model.Role;
import com.ashkanamin.EMS.model.RoleName;
import com.ashkanamin.EMS.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Optional<Role> findByName(RoleName roleName) {
        return roleRepository.findByName(roleName);
    }


    public Role save(Role role) {
        return roleRepository.save(role);
    }
}
