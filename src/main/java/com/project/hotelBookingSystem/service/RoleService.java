package com.project.hotelBookingSystem.service;

import com.project.hotelBookingSystem.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role addRole(Role role);
    String updateRole(Role role);
    String deleteRole(Long id);
}
