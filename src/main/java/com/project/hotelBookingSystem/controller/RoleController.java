package com.project.hotelBookingSystem.controller;

import com.project.hotelBookingSystem.entity.Client;
import com.project.hotelBookingSystem.entity.Role;
import com.project.hotelBookingSystem.service.ClientService;
import com.project.hotelBookingSystem.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/role")
@RestController
@AllArgsConstructor
public class RoleController {
    private final RoleService roleService;

    @GetMapping("/getAll")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PostMapping("/add")
    public Role addRole(@RequestBody Role role) {
        roleService.addRole(role);
        return role;
    }

    @PutMapping("/update")
    public String updateRole(@RequestBody Role role) {
        roleService.updateRole(role);
        return "Success";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteRole(@PathVariable Long id) {
        roleService.deleteRole(id);
        return "Success";
    }
}
