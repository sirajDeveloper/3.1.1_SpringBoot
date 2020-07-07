package com.example.DAO;

import com.example.model.Role;
import org.springframework.stereotype.Repository;
import com.example.model.Role;

@Repository
public interface RoleDao {
    Role findByRole(String role);
}
