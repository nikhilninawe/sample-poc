package com.turvo.main.repository;

import com.turvo.main.core.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
