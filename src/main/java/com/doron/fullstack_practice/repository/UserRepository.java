package com.doron.fullstack_practice.repository;

import com.doron.fullstack_practice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
