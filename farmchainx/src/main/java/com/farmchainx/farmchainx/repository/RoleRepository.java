package com.farmchainx.farmchainx.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmchainx.farmchainx.model.Role;
import com.farmchainx.farmchainx.model.User;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByRoleName(String rolename);

	boolean existsByRoleName(String roleName);

	//Optional<User> findByRoleName(String string);

}
