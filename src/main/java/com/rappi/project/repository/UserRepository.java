package com.rappi.project.repository;
 
import com.rappi.project.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // public boolean existsByEmail(String email);
    User findByEmail(String email);
}