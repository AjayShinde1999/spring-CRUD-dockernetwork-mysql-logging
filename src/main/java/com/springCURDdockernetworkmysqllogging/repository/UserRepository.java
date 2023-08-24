package com.springCURDdockernetworkmysqllogging.repository;

import com.springCURDdockernetworkmysqllogging.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
