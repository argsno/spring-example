package com.argsno.springbootweb.repository;

import com.argsno.springbootweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameAndEmail(String userName, String email);
}
