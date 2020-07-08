package com.example.DAO;

import com.example.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@Repository
public class RoleDaoImpl implements RoleDao {

    @Autowired
    EntityManager entityManager;
    @Override
    public Role findByRole(String role) {
        TypedQuery<Role> query = entityManager.createQuery("from Role where role = :role", Role.class);
        query.setParameter("role", role);
        return query.getSingleResult();
    }
}
