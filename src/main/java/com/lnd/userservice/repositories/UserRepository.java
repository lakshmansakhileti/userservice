package com.lnd.userservice.repositories;

import com.lnd.userservice.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
