package com.nnobrega.userdept.repositories;

import com.nnobrega.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
