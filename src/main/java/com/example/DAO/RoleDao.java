package com.example.DAO;

import com.example.model.Role;

public interface RoleDao {
    Role findByRole(String role);
    Role findByRole(Long id);
}
