package com.practo.springbootdocker.user.repository;

import com.practo.springbootdocker.user.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
