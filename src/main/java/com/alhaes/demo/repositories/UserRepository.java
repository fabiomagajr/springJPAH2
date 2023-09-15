package com.alhaes.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alhaes.demo.entities.User;
public interface UserRepository extends JpaRepository<User, Long>{
    
}
