package com.obmaikano.pollingapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obmaikano.pollingapp.models.Role;
import com.obmaikano.pollingapp.models.RoleName;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Optional<Role> findByName(RoleName name);

}
