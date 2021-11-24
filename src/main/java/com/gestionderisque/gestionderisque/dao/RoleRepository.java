package com.gestionderisque.gestionderisque.dao;

import java.util.Optional;

import com.gestionderisque.gestionderisque.model.Role;
import com.gestionderisque.gestionderisque.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
 
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}